package com.tiger.model;

public class UserVisitProdLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_visit_prod_log.user
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private Integer user;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_visit_prod_log.product
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private Integer product;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_visit_prod_log.user
     *
     * @return the value of user_visit_prod_log.user
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public Integer getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_visit_prod_log.user
     *
     * @param user the value for user_visit_prod_log.user
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setUser(Integer user) {
        this.user = user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_visit_prod_log.product
     *
     * @return the value of user_visit_prod_log.product
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public Integer getProduct() {
        return product;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_visit_prod_log.product
     *
     * @param product the value for user_visit_prod_log.product
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setProduct(Integer product) {
        this.product = product;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_visit_prod_log
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
        sb.append(", product=").append(product);
        sb.append("]");
        return sb.toString();
    }
}