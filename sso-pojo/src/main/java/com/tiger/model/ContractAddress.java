package com.tiger.model;

public class ContractAddress {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_address.id
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_address.province
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private Integer province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_address.city
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private Integer city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_address.area
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private Integer area;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_address.address
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_address.system_user
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private Integer systemUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_address.id
     *
     * @return the value of contract_address.id
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_address.id
     *
     * @param id the value for contract_address.id
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_address.province
     *
     * @return the value of contract_address.province
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public Integer getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_address.province
     *
     * @param province the value for contract_address.province
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setProvince(Integer province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_address.city
     *
     * @return the value of contract_address.city
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public Integer getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_address.city
     *
     * @param city the value for contract_address.city
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setCity(Integer city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_address.area
     *
     * @return the value of contract_address.area
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public Integer getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_address.area
     *
     * @param area the value for contract_address.area
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setArea(Integer area) {
        this.area = area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_address.address
     *
     * @return the value of contract_address.address
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_address.address
     *
     * @param address the value for contract_address.address
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_address.system_user
     *
     * @return the value of contract_address.system_user
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public Integer getSystemUser() {
        return systemUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_address.system_user
     *
     * @param systemUser the value for contract_address.system_user
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setSystemUser(Integer systemUser) {
        this.systemUser = systemUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_address
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", address=").append(address);
        sb.append(", systemUser=").append(systemUser);
        sb.append("]");
        return sb.toString();
    }
}