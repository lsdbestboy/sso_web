package com.tiger.model;

public class TerminalDevice {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column terminal_device.id
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column terminal_device.name
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column terminal_device.number
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private String number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column terminal_device.device_supplier
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private Integer deviceSupplier;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column terminal_device.id
     *
     * @return the value of terminal_device.id
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column terminal_device.id
     *
     * @param id the value for terminal_device.id
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column terminal_device.name
     *
     * @return the value of terminal_device.name
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column terminal_device.name
     *
     * @param name the value for terminal_device.name
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column terminal_device.number
     *
     * @return the value of terminal_device.number
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public String getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column terminal_device.number
     *
     * @param number the value for terminal_device.number
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column terminal_device.device_supplier
     *
     * @return the value of terminal_device.device_supplier
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public Integer getDeviceSupplier() {
        return deviceSupplier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column terminal_device.device_supplier
     *
     * @param deviceSupplier the value for terminal_device.device_supplier
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setDeviceSupplier(Integer deviceSupplier) {
        this.deviceSupplier = deviceSupplier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table terminal_device
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
        sb.append(", name=").append(name);
        sb.append(", number=").append(number);
        sb.append(", deviceSupplier=").append(deviceSupplier);
        sb.append("]");
        return sb.toString();
    }
}