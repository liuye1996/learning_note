package com.example.liuye1996.copyPropertiesPerformanceTest;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 *
 * @author yuhang_lou
 * @版权所有 聚光科技（杭州）股份有限公司
 */
@Getter
@Setter
public class AlarmConfig {
    private Long id;

    private String areaCode;

    private String alarmRuleName;

    private String alarmType;

    private String alarmLevel;

    private String configJson;

    private String factoryJson;

    private String publicConfig;

    private Integer version;

    private Date createTime;

    private Date modifyTime;

    private Boolean deleteflag;

}