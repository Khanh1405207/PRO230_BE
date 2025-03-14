/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author ADMIN
 */
public class Admin {

    private Integer idAdmin;
    private String name;
    private LocalDate doB;
    private String sex;
    private LocalDateTime createDate;
    private String email;
    private String phoneNumber;
    private String address;
    private String status;
    private String description;
    private String image;
    private String password;
    private String userName;
    private Boolean emailConfirmed;
    private Boolean phoneNumberConfirmed;
    private String passwordHash;
    private Boolean logOut;
    private Integer accessFailCount;

    public Admin() {
    }

    public Admin(Integer idAdmin, String name, LocalDate doB, String sex, LocalDateTime createDate, String email, String phoneNumber, String address, String status, String description, String image, String password, String userName, Boolean emailConfirmed, Boolean phoneNumberConfirmed, String passwordHash, Boolean logOut, Integer accessFailCount) {
        this.idAdmin = idAdmin;
        this.name = name;
        this.doB = doB;
        this.sex = sex;
        this.createDate = createDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.status = status;
        this.description = description;
        this.image = image;
        this.password = password;
        this.userName = userName;
        this.emailConfirmed = emailConfirmed;
        this.phoneNumberConfirmed = phoneNumberConfirmed;
        this.passwordHash = passwordHash;
        this.logOut = logOut;
        this.accessFailCount = accessFailCount;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDoB() {
        return doB;
    }

    public void setDoB(LocalDate doB) {
        this.doB = doB;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getEmailConfirmed() {
        return emailConfirmed;
    }

    public void setEmailConfirmed(Boolean emailConfirmed) {
        this.emailConfirmed = emailConfirmed;
    }

    public Boolean getPhoneNumberConfirmed() {
        return phoneNumberConfirmed;
    }

    public void setPhoneNumberConfirmed(Boolean phoneNumberConfirmed) {
        this.phoneNumberConfirmed = phoneNumberConfirmed;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Boolean getLogOut() {
        return logOut;
    }

    public void setLogOut(Boolean logOut) {
        this.logOut = logOut;
    }

    public Integer getAccessFailCount() {
        return accessFailCount;
    }

    public void setAccessFailCount(Integer accessFailCount) {
        this.accessFailCount = accessFailCount;
    }

}
