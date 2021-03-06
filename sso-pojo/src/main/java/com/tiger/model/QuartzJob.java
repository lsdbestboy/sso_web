package com.tiger.model;

public class QuartzJob {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_job.name
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_job.class_name
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    private String className;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_job.group_name
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    private String groupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_job.description
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_job.name
     *
     * @return the value of quartz_job.name
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_job.name
     *
     * @param name the value for quartz_job.name
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_job.class_name
     *
     * @return the value of quartz_job.class_name
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_job.class_name
     *
     * @param className the value for quartz_job.class_name
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_job.group_name
     *
     * @return the value of quartz_job.group_name
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_job.group_name
     *
     * @param groupName the value for quartz_job.group_name
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_job.description
     *
     * @return the value of quartz_job.description
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_job.description
     *
     * @param description the value for quartz_job.description
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_job
     *
     * @mbggenerated Fri Dec 02 13:04:44 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", className=").append(className);
        sb.append(", groupName=").append(groupName);
        sb.append(", description=").append(description);
        sb.append("]");
        return sb.toString();
    }
}