/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDateTime;

/**
 *
 * @author ADMIN
 */
public class DeliveryAddress {
    private Integer id;
    private int customerID;
    private String name;
    private Integer provinceID;
    private String provinceName;
    private Integer districtID;
    private String districtName;
    private String wardCode;
    private String address;
    private String phoneNumber;
    private String description;
    private String image;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    public DeliveryAddress() {
    }

    public DeliveryAddress(Integer id, int customerID, String name, Integer provinceID, String provinceName, Integer districtID, String districtName, String wardCode, String address, String phoneNumber, String description, String image, LocalDateTime createDate, LocalDateTime updateDate) {
        this.id = id;
        this.customerID = customerID;
        this.name = name;
        this.provinceID = provinceID;
        this.provinceName = provinceName;
        this.districtID = districtID;
        this.districtName = districtName;
        this.wardCode = wardCode;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.image = image;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(Integer provinceID) {
        this.provinceID = provinceID;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getDistrictID() {
        return districtID;
    }

    public void setDistrictID(Integer districtID) {
        this.districtID = districtID;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getWardCode() {
        return wardCode;
    }

    public void setWardCode(String wardCode) {
        this.wardCode = wardCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
    
}
