package com.tiger.model;

public class UserRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.user
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private Integer user;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.role
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private Integer role;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.user
     *
     * @return the value of user_role.user
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public Integer getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.user
     *
     * @param user the value for user_role.user
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setUser(Integer user) {
        this.user = user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.role
     *
     * @return the value of user_role.role
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public Integer getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.role
     *
     * @param role the value for user_role.role
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
        sb.append(", role=").append(role);
        sb.append("]");
        return sb.toString();
    }
}