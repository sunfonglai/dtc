package com.sunfong.dtc.mapper.webservice;

import com.sunfong.dtc.dob.entity.webservice.DtcWsMethodDetail;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "dtcWsMethodDetailMapper")
public interface DtcWsMethodDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DTC_WS_METHOD_DETAIL
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DTC_WS_METHOD_DETAIL
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    int insert(DtcWsMethodDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DTC_WS_METHOD_DETAIL
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    int insertSelective(DtcWsMethodDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DTC_WS_METHOD_DETAIL
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    DtcWsMethodDetail selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DTC_WS_METHOD_DETAIL
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    int updateByPrimaryKeySelective(DtcWsMethodDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DTC_WS_METHOD_DETAIL
     *
     * @mbg.generated 2018-12-19 15:20:33
     */
    int updateByPrimaryKey(DtcWsMethodDetail record);

    List selectWsServerDetail();
}