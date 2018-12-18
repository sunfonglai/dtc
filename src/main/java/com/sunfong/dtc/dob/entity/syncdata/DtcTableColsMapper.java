package com.sunfong.dtc.dob.entity.syncdata;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table DTC_TABLE_COLS_MAPPER
 *
 * @mbg.generated do_not_delete_during_merge 2018-12-06 16:06:28
 */
public class DtcTableColsMapper implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_TABLE_COLS_MAPPER.ID
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_TABLE_COLS_MAPPER.SRC_ID
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    private String srcId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_TABLE_COLS_MAPPER.SRC_COL_NAME
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    private String srcColName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_TABLE_COLS_MAPPER.SRC_COL_DATA_TYPE
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    private String srcColDataType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_TABLE_COLS_MAPPER.SRC_DEFAULT_VAL
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    private String srcDefaultVal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_TABLE_COLS_MAPPER.TRG_ID
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    private String trgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_TABLE_COLS_MAPPER.TRG_COL_NAME
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    private String trgColName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_TABLE_COLS_MAPPER.TRG_COL_DATA_TYPE
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    private String trgColDataType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_TABLE_COLS_MAPPER.TRG_DEFAULT_VAL
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    private String trgDefaultVal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_TABLE_COLS_MAPPER.SRC_TABLE_NAME
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    private String srcTableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_TABLE_COLS_MAPPER.TRG_TABLE_NAME
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    private String trgTableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_TABLE_COLS_MAPPER.COL_ORDER
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    private Integer colOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DTC_TABLE_COLS_MAPPER
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_TABLE_COLS_MAPPER.ID
     *
     * @return the value of DTC_TABLE_COLS_MAPPER.ID
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_TABLE_COLS_MAPPER.ID
     *
     * @param id the value for DTC_TABLE_COLS_MAPPER.ID
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_TABLE_COLS_MAPPER.SRC_ID
     *
     * @return the value of DTC_TABLE_COLS_MAPPER.SRC_ID
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public String getSrcId() {
        return srcId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_TABLE_COLS_MAPPER.SRC_ID
     *
     * @param srcId the value for DTC_TABLE_COLS_MAPPER.SRC_ID
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public void setSrcId(String srcId) {
        this.srcId = srcId == null ? null : srcId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_TABLE_COLS_MAPPER.SRC_COL_NAME
     *
     * @return the value of DTC_TABLE_COLS_MAPPER.SRC_COL_NAME
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public String getSrcColName() {
        return srcColName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_TABLE_COLS_MAPPER.SRC_COL_NAME
     *
     * @param srcColName the value for DTC_TABLE_COLS_MAPPER.SRC_COL_NAME
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public void setSrcColName(String srcColName) {
        this.srcColName = srcColName == null ? null : srcColName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_TABLE_COLS_MAPPER.SRC_COL_DATA_TYPE
     *
     * @return the value of DTC_TABLE_COLS_MAPPER.SRC_COL_DATA_TYPE
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public String getSrcColDataType() {
        return srcColDataType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_TABLE_COLS_MAPPER.SRC_COL_DATA_TYPE
     *
     * @param srcColDataType the value for DTC_TABLE_COLS_MAPPER.SRC_COL_DATA_TYPE
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public void setSrcColDataType(String srcColDataType) {
        this.srcColDataType = srcColDataType == null ? null : srcColDataType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_TABLE_COLS_MAPPER.SRC_DEFAULT_VAL
     *
     * @return the value of DTC_TABLE_COLS_MAPPER.SRC_DEFAULT_VAL
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public String getSrcDefaultVal() {
        return srcDefaultVal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_TABLE_COLS_MAPPER.SRC_DEFAULT_VAL
     *
     * @param srcDefaultVal the value for DTC_TABLE_COLS_MAPPER.SRC_DEFAULT_VAL
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public void setSrcDefaultVal(String srcDefaultVal) {
        this.srcDefaultVal = srcDefaultVal == null ? null : srcDefaultVal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_TABLE_COLS_MAPPER.TRG_ID
     *
     * @return the value of DTC_TABLE_COLS_MAPPER.TRG_ID
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public String getTrgId() {
        return trgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_TABLE_COLS_MAPPER.TRG_ID
     *
     * @param trgId the value for DTC_TABLE_COLS_MAPPER.TRG_ID
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public void setTrgId(String trgId) {
        this.trgId = trgId == null ? null : trgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_TABLE_COLS_MAPPER.TRG_COL_NAME
     *
     * @return the value of DTC_TABLE_COLS_MAPPER.TRG_COL_NAME
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public String getTrgColName() {
        return trgColName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_TABLE_COLS_MAPPER.TRG_COL_NAME
     *
     * @param trgColName the value for DTC_TABLE_COLS_MAPPER.TRG_COL_NAME
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public void setTrgColName(String trgColName) {
        this.trgColName = trgColName == null ? null : trgColName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_TABLE_COLS_MAPPER.TRG_COL_DATA_TYPE
     *
     * @return the value of DTC_TABLE_COLS_MAPPER.TRG_COL_DATA_TYPE
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public String getTrgColDataType() {
        return trgColDataType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_TABLE_COLS_MAPPER.TRG_COL_DATA_TYPE
     *
     * @param trgColDataType the value for DTC_TABLE_COLS_MAPPER.TRG_COL_DATA_TYPE
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public void setTrgColDataType(String trgColDataType) {
        this.trgColDataType = trgColDataType == null ? null : trgColDataType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_TABLE_COLS_MAPPER.TRG_DEFAULT_VAL
     *
     * @return the value of DTC_TABLE_COLS_MAPPER.TRG_DEFAULT_VAL
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public String getTrgDefaultVal() {
        return trgDefaultVal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_TABLE_COLS_MAPPER.TRG_DEFAULT_VAL
     *
     * @param trgDefaultVal the value for DTC_TABLE_COLS_MAPPER.TRG_DEFAULT_VAL
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public void setTrgDefaultVal(String trgDefaultVal) {
        this.trgDefaultVal = trgDefaultVal == null ? null : trgDefaultVal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_TABLE_COLS_MAPPER.SRC_TABLE_NAME
     *
     * @return the value of DTC_TABLE_COLS_MAPPER.SRC_TABLE_NAME
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public String getSrcTableName() {
        return srcTableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_TABLE_COLS_MAPPER.SRC_TABLE_NAME
     *
     * @param srcTableName the value for DTC_TABLE_COLS_MAPPER.SRC_TABLE_NAME
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public void setSrcTableName(String srcTableName) {
        this.srcTableName = srcTableName == null ? null : srcTableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_TABLE_COLS_MAPPER.TRG_TABLE_NAME
     *
     * @return the value of DTC_TABLE_COLS_MAPPER.TRG_TABLE_NAME
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public String getTrgTableName() {
        return trgTableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_TABLE_COLS_MAPPER.TRG_TABLE_NAME
     *
     * @param trgTableName the value for DTC_TABLE_COLS_MAPPER.TRG_TABLE_NAME
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public void setTrgTableName(String trgTableName) {
        this.trgTableName = trgTableName == null ? null : trgTableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_TABLE_COLS_MAPPER.COL_ORDER
     *
     * @return the value of DTC_TABLE_COLS_MAPPER.COL_ORDER
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public Integer getColOrder() {
        return colOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_TABLE_COLS_MAPPER.COL_ORDER
     *
     * @param colOrder the value for DTC_TABLE_COLS_MAPPER.COL_ORDER
     *
     * @mbg.generated 2018-12-06 16:06:28
     */
    public void setColOrder(Integer colOrder) {
        this.colOrder = colOrder;
    }
}