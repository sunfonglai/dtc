package com.sunfong.dtc.dob.entity.syncdata;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table DTC_DATA_SOURCE
 *
 * @mbg.generated do_not_delete_during_merge 2018-12-19 15:47:16
 */
public class DtcDataSource implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_DATA_SOURCE.SOURCE_ID
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    private String sourceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_DATA_SOURCE.DB_TYPE
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    private String dbType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_DATA_SOURCE.DB_URL
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    private String dbUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_DATA_SOURCE.DB_USER_NAME
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    private String dbUserName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_DATA_SOURCE.DB_PASSWORD
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    private String dbPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_DATA_SOURCE.SOURCE_NAME
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    private String sourceName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DTC_DATA_SOURCE.APP_VERSION
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    private String appVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DTC_DATA_SOURCE
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_DATA_SOURCE.SOURCE_ID
     *
     * @return the value of DTC_DATA_SOURCE.SOURCE_ID
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_DATA_SOURCE.SOURCE_ID
     *
     * @param sourceId the value for DTC_DATA_SOURCE.SOURCE_ID
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_DATA_SOURCE.DB_TYPE
     *
     * @return the value of DTC_DATA_SOURCE.DB_TYPE
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    public String getDbType() {
        return dbType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_DATA_SOURCE.DB_TYPE
     *
     * @param dbType the value for DTC_DATA_SOURCE.DB_TYPE
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    public void setDbType(String dbType) {
        this.dbType = dbType == null ? null : dbType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_DATA_SOURCE.DB_URL
     *
     * @return the value of DTC_DATA_SOURCE.DB_URL
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    public String getDbUrl() {
        return dbUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_DATA_SOURCE.DB_URL
     *
     * @param dbUrl the value for DTC_DATA_SOURCE.DB_URL
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl == null ? null : dbUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_DATA_SOURCE.DB_USER_NAME
     *
     * @return the value of DTC_DATA_SOURCE.DB_USER_NAME
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    public String getDbUserName() {
        return dbUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_DATA_SOURCE.DB_USER_NAME
     *
     * @param dbUserName the value for DTC_DATA_SOURCE.DB_USER_NAME
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName == null ? null : dbUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_DATA_SOURCE.DB_PASSWORD
     *
     * @return the value of DTC_DATA_SOURCE.DB_PASSWORD
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    public String getDbPassword() {
        return dbPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_DATA_SOURCE.DB_PASSWORD
     *
     * @param dbPassword the value for DTC_DATA_SOURCE.DB_PASSWORD
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword == null ? null : dbPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_DATA_SOURCE.SOURCE_NAME
     *
     * @return the value of DTC_DATA_SOURCE.SOURCE_NAME
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_DATA_SOURCE.SOURCE_NAME
     *
     * @param sourceName the value for DTC_DATA_SOURCE.SOURCE_NAME
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DTC_DATA_SOURCE.APP_VERSION
     *
     * @return the value of DTC_DATA_SOURCE.APP_VERSION
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DTC_DATA_SOURCE.APP_VERSION
     *
     * @param appVersion the value for DTC_DATA_SOURCE.APP_VERSION
     *
     * @mbg.generated 2018-12-19 15:47:16
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }
}