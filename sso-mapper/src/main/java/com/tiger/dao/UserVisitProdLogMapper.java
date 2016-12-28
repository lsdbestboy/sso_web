package com.tiger.dao;

import com.tiger.model.UserVisitProdLog;
import com.tiger.model.UserVisitProdLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserVisitProdLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_visit_prod_log
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    int countByExample(UserVisitProdLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_visit_prod_log
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    int deleteByExample(UserVisitProdLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_visit_prod_log
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    int deleteByPrimaryKey(@Param("user") Integer user, @Param("product") Integer product);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_visit_prod_log
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    int insert(UserVisitProdLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_visit_prod_log
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    int insertSelective(UserVisitProdLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_visit_prod_log
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    List<UserVisitProdLog> selectByExample(UserVisitProdLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_visit_prod_log
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    int updateByExampleSelective(@Param("record") UserVisitProdLog record, @Param("example") UserVisitProdLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_visit_prod_log
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    int updateByExample(@Param("record") UserVisitProdLog record, @Param("example") UserVisitProdLogExample example);
}