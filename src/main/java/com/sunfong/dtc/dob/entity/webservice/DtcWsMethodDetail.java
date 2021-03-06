package com.sunfong.dtc.dob.entity.webservice;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table DTC_WS_METHOD_DETAIL
 *
 * @mbg.generated do_not_delete_during_merge 2018-12-19 15:20:33
 */
public class DtcWsMethodDetail implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_WS_METHOD_DETAIL.ID
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_WS_METHOD_DETAIL.METHOD_NAME
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    private String methodName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_WS_METHOD_DETAIL.DESCRPT
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    private String descrpt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_WS_METHOD_DETAIL.WS_CONFIG_ID
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    private String wsConfigId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_WS_METHOD_DETAIL.PARAM1
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    private String param1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_WS_METHOD_DETAIL.PARAM2
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    private String param2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_WS_METHOD_DETAIL.PARAM3
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    private String param3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_WS_METHOD_DETAIL.PARAM4
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    private String param4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_WS_METHOD_DETAIL.PARAM5
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    private String param5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_WS_METHOD_DETAIL.PARAM6
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    private String param6;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DTC_WS_METHOD_DETAIL
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_WS_METHOD_DETAIL.ID
     *
     * @return the value of DTC_WS_METHOD_DETAIL.ID
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_WS_METHOD_DETAIL.ID
     *
     * @param id the value for DTC_WS_METHOD_DETAIL.ID
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_WS_METHOD_DETAIL.METHOD_NAME
     *
     * @return the value of DTC_WS_METHOD_DETAIL.METHOD_NAME
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_WS_METHOD_DETAIL.METHOD_NAME
     *
     * @param methodName the value for DTC_WS_METHOD_DETAIL.METHOD_NAME
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_WS_METHOD_DETAIL.DESCRPT
     *
     * @return the value of DTC_WS_METHOD_DETAIL.DESCRPT
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public String getDescrpt() {
        return descrpt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_WS_METHOD_DETAIL.DESCRPT
     *
     * @param descrpt the value for DTC_WS_METHOD_DETAIL.DESCRPT
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public void setDescrpt(String descrpt) {
        this.descrpt = descrpt == null ? null : descrpt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_WS_METHOD_DETAIL.WS_CONFIG_ID
     *
     * @return the value of DTC_WS_METHOD_DETAIL.WS_CONFIG_ID
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public String getWsConfigId() {
        return wsConfigId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_WS_METHOD_DETAIL.WS_CONFIG_ID
     *
     * @param wsConfigId the value for DTC_WS_METHOD_DETAIL.WS_CONFIG_ID
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public void setWsConfigId(String wsConfigId) {
        this.wsConfigId = wsConfigId == null ? null : wsConfigId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_WS_METHOD_DETAIL.PARAM1
     *
     * @return the value of DTC_WS_METHOD_DETAIL.PARAM1
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public String getParam1() {
        return param1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_WS_METHOD_DETAIL.PARAM1
     *
     * @param param1 the value for DTC_WS_METHOD_DETAIL.PARAM1
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public void setParam1(String param1) {
        this.param1 = param1 == null ? null : param1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_WS_METHOD_DETAIL.PARAM2
     *
     * @return the value of DTC_WS_METHOD_DETAIL.PARAM2
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public String getParam2() {
        return param2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_WS_METHOD_DETAIL.PARAM2
     *
     * @param param2 the value for DTC_WS_METHOD_DETAIL.PARAM2
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public void setParam2(String param2) {
        this.param2 = param2 == null ? null : param2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_WS_METHOD_DETAIL.PARAM3
     *
     * @return the value of DTC_WS_METHOD_DETAIL.PARAM3
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public String getParam3() {
        return param3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_WS_METHOD_DETAIL.PARAM3
     *
     * @param param3 the value for DTC_WS_METHOD_DETAIL.PARAM3
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public void setParam3(String param3) {
        this.param3 = param3 == null ? null : param3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_WS_METHOD_DETAIL.PARAM4
     *
     * @return the value of DTC_WS_METHOD_DETAIL.PARAM4
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public String getParam4() {
        return param4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_WS_METHOD_DETAIL.PARAM4
     *
     * @param param4 the value for DTC_WS_METHOD_DETAIL.PARAM4
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public void setParam4(String param4) {
        this.param4 = param4 == null ? null : param4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_WS_METHOD_DETAIL.PARAM5
     *
     * @return the value of DTC_WS_METHOD_DETAIL.PARAM5
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public String getParam5() {
        return param5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_WS_METHOD_DETAIL.PARAM5
     *
     * @param param5 the value for DTC_WS_METHOD_DETAIL.PARAM5
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public void setParam5(String param5) {
        this.param5 = param5 == null ? null : param5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_WS_METHOD_DETAIL.PARAM6
     *
     * @return the value of DTC_WS_METHOD_DETAIL.PARAM6
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public String getParam6() {
        return param6;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_WS_METHOD_DETAIL.PARAM6
     *
     * @param param6 the value for DTC_WS_METHOD_DETAIL.PARAM6
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    public void setParam6(String param6) {
        this.param6 = param6 == null ? null : param6.trim();
    }
}