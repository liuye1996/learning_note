package com.example.liuye1996.copyPropertiesPerformanceTest;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 *
 * @author liuye1996
 * @Date 2021-01-31 14:28:40
 *
 */

@Getter
@Setter
public class AlarmConfigVo {
    private Long id;
    /** 区域编码 */
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

    private int offset ;

    private int limit;

    private String areaCodeName;

    private String parentAreaName;

    private String queryName;

    private String alarmLevelName;

    private String alarmTypeName;

    private String siteCode;

    private String excludeAreaCode;

    private String excludeSiteCode;

    private int isThisArea;

    private int isRelation;

    private String treeId;

    private String treeType;

    /**
     * Type definition error: [simple type, class com.fpi.alarm.configdata.model.vo.AlarmConfigVo]; nested exception is com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Cannot construct instance of `com.fpi.alarm.configdata.model.vo.AlarmConfigVo` (no Creators, like default construct, exist): cannot deserialize from Object value (no delegate- or property-based Creator)
     *  at [Source: (PushbackInputStream); line: 1, column: 2]
     *
     *  json类型转换必须要有构造方法
     */
    public AlarmConfigVo() {
    }

    public AlarmConfigVo(AlarmConfig source){

        this.id = source.getId();

        this.areaCode = source.getAreaCode();

        this.alarmRuleName = source.getAlarmRuleName();

        this.alarmType = source.getAlarmType();

        this.alarmLevel  = source.getAlarmLevel();

        this.configJson = source.getConfigJson();

        this.factoryJson = source.getFactoryJson();

        this.publicConfig = source.getPublicConfig();

        this.version = source.getVersion();

        this.createTime = source.getCreateTime();

        this.modifyTime = source.getModifyTime();

        this.deleteflag = source.getDeleteflag();


    }


}