package com.tiger.dao;

import com.tiger.model.QuartzJob;
import com.tiger.model.QuartzJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuartzJobMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    int countByExample(QuartzJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    int deleteByExample(QuartzJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    int deleteByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    int insert(QuartzJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    int insertSelective(QuartzJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    List<QuartzJob> selectByExample(QuartzJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    QuartzJob selectByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    int updateByExampleSelective(@Param("record") QuartzJob record, @Param("example") QuartzJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    int updateByExample(@Param("record") QuartzJob record, @Param("example") QuartzJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    int updateByPrimaryKeySelective(QuartzJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    int updateByPrimaryKey(QuartzJob record);
}