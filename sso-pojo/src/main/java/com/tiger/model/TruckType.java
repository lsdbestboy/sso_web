package com.tiger.model;

import java.math.BigDecimal;

public class TruckType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck_type.id
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck_type.name
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck_type.truck_number
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private String truckNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck_type.truck_length
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private BigDecimal truckLength;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck_type.truck_width
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private BigDecimal truckWidth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck_type.truck_height
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private BigDecimal truckHeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck_type.truck_weight
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private BigDecimal truckWeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck_type.transport_weight
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private BigDecimal transportWeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck_type.transport_volume
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private BigDecimal transportVolume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck_type.loading_length
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private String loadingLength;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck_type.fuel_type
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private Integer fuelType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck_type.driver_type
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private Integer driverType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column truck_type.truck_supplier
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    private Integer truckSupplier;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck_type.id
     *
     * @return the value of truck_type.id
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck_type.id
     *
     * @param id the value for truck_type.id
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck_type.name
     *
     * @return the value of truck_type.name
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck_type.name
     *
     * @param name the value for truck_type.name
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck_type.truck_number
     *
     * @return the value of truck_type.truck_number
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public String getTruckNumber() {
        return truckNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck_type.truck_number
     *
     * @param truckNumber the value for truck_type.truck_number
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setTruckNumber(String truckNumber) {
        this.truckNumber = truckNumber == null ? null : truckNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck_type.truck_length
     *
     * @return the value of truck_type.truck_length
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public BigDecimal getTruckLength() {
        return truckLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck_type.truck_length
     *
     * @param truckLength the value for truck_type.truck_length
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setTruckLength(BigDecimal truckLength) {
        this.truckLength = truckLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck_type.truck_width
     *
     * @return the value of truck_type.truck_width
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public BigDecimal getTruckWidth() {
        return truckWidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck_type.truck_width
     *
     * @param truckWidth the value for truck_type.truck_width
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setTruckWidth(BigDecimal truckWidth) {
        this.truckWidth = truckWidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck_type.truck_height
     *
     * @return the value of truck_type.truck_height
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public BigDecimal getTruckHeight() {
        return truckHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck_type.truck_height
     *
     * @param truckHeight the value for truck_type.truck_height
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setTruckHeight(BigDecimal truckHeight) {
        this.truckHeight = truckHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck_type.truck_weight
     *
     * @return the value of truck_type.truck_weight
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public BigDecimal getTruckWeight() {
        return truckWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck_type.truck_weight
     *
     * @param truckWeight the value for truck_type.truck_weight
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setTruckWeight(BigDecimal truckWeight) {
        this.truckWeight = truckWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck_type.transport_weight
     *
     * @return the value of truck_type.transport_weight
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public BigDecimal getTransportWeight() {
        return transportWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck_type.transport_weight
     *
     * @param transportWeight the value for truck_type.transport_weight
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setTransportWeight(BigDecimal transportWeight) {
        this.transportWeight = transportWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck_type.transport_volume
     *
     * @return the value of truck_type.transport_volume
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public BigDecimal getTransportVolume() {
        return transportVolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck_type.transport_volume
     *
     * @param transportVolume the value for truck_type.transport_volume
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setTransportVolume(BigDecimal transportVolume) {
        this.transportVolume = transportVolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck_type.loading_length
     *
     * @return the value of truck_type.loading_length
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public String getLoadingLength() {
        return loadingLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck_type.loading_length
     *
     * @param loadingLength the value for truck_type.loading_length
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setLoadingLength(String loadingLength) {
        this.loadingLength = loadingLength == null ? null : loadingLength.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck_type.fuel_type
     *
     * @return the value of truck_type.fuel_type
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public Integer getFuelType() {
        return fuelType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck_type.fuel_type
     *
     * @param fuelType the value for truck_type.fuel_type
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setFuelType(Integer fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck_type.driver_type
     *
     * @return the value of truck_type.driver_type
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public Integer getDriverType() {
        return driverType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck_type.driver_type
     *
     * @param driverType the value for truck_type.driver_type
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setDriverType(Integer driverType) {
        this.driverType = driverType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck_type.truck_supplier
     *
     * @return the value of truck_type.truck_supplier
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public Integer getTruckSupplier() {
        return truckSupplier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck_type.truck_supplier
     *
     * @param truckSupplier the value for truck_type.truck_supplier
     *
     * @mbggenerated Wed Dec 07 09:27:22 CST 2016
     */
    public void setTruckSupplier(Integer truckSupplier) {
        this.truckSupplier = truckSupplier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table truck_type
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
        sb.append(", truckNumber=").append(truckNumber);
        sb.append(", truckLength=").append(truckLength);
        sb.append(", truckWidth=").append(truckWidth);
        sb.append(", truckHeight=").append(truckHeight);
        sb.append(", truckWeight=").append(truckWeight);
        sb.append(", transportWeight=").append(transportWeight);
        sb.append(", transportVolume=").append(transportVolume);
        sb.append(", loadingLength=").append(loadingLength);
        sb.append(", fuelType=").append(fuelType);
        sb.append(", driverType=").append(driverType);
        sb.append(", truckSupplier=").append(truckSupplier);
        sb.append("]");
        return sb.toString();
    }
}