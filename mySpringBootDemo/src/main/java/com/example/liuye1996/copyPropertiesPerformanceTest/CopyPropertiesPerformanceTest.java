package com.example.liuye1996.copyPropertiesPerformanceTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @Author: ye_liu
 * @Date: 2021/1/31 14:31
 */
public class CopyPropertiesPerformanceTest {

    private static final Logger logger = LoggerFactory.getLogger(CopyPropertiesPerformanceTest.class);

    /**
     * ////CopyPropertiesPerformanceTest, Time: 1351, codeBlock: BeanUtils.copyProperties(), requestId: 001
     * ////CopyPropertiesPerformanceTest, Time: 3, codeBlock: new AlarmConfigVo(alarmconfig), requestId: 001
     *
     * 10w次性能差距较明显，copyProperties用到了反射，目标字段越多越慢
     *
     * @param args
     */
    public static void main(String[] args) {
        Date date = new Date();
        // 构造一个原数据
        AlarmConfig alarmconfig = new AlarmConfig();
        alarmconfig.setId(1L);
        alarmconfig.setAlarmLevel("aaa");
        alarmconfig.setAlarmRuleName("bbb");
        alarmconfig.setAlarmType("ccc");
        alarmconfig.setAreaCode("ddd");
        alarmconfig.setConfigJson("eee");
        alarmconfig.setCreateTime(date);
        alarmconfig.setDeleteflag(Boolean.FALSE);
        alarmconfig.setFactoryJson("fff");
        alarmconfig.setModifyTime(date);
        alarmconfig.setPublicConfig("ggg");
        alarmconfig.setVersion(0);
        int repeatTimes = 100000;
        long start = System.currentTimeMillis();
        // 使用BeanUtils.copyProperties()方法
        for (int i=0;i < repeatTimes;i++){
            AlarmConfigVo alarmConfigVo = new AlarmConfigVo();
            BeanUtils.copyProperties(alarmconfig, alarmConfigVo);
        }
        ////////
        logger.debug(String.format("////CopyPropertiesPerformanceTest, Time: %d, codeBlock: %s, requestId: %s",
                System.currentTimeMillis() - start, "BeanUtils.copyProperties()", "001"));
        ////////
        start = System.currentTimeMillis();
        //  使用构造方法直接赋值
        for (int i=0;i < repeatTimes;i++){
            AlarmConfigVo alarmConfigVo = new AlarmConfigVo(alarmconfig);
        }
        ////////
        logger.debug(String.format("////CopyPropertiesPerformanceTest, Time: %d, codeBlock: %s, requestId: %s",
                System.currentTimeMillis() - start, "new AlarmConfigVo(alarmconfig)", "001"));
        ////////
    }

}
