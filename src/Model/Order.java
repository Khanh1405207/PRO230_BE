/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author ADMIN
 */
public class Order {

    private Integer uniqueID;
    private Customer customer;
    private Admin admin;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private LocalDateTime paymentDate;
    private String paymentType;
    private String shippingAddress;
    private String shippingPhoneNumber;
    private BigDecimal shippingFee;
    private BigDecimal totalMoney;
    private String status;
    private String description;
    private String reasonOfChange;
    private String historyLogChange;

    public Order() {
    }

    public Order(Integer uniqueID, Customer customer, Admin admin, LocalDateTime createDate, LocalDateTime updateDate, LocalDateTime paymentDate, String paymentType, String shippingAddress, String shippingPhoneNumber, BigDecimal shippingFee, BigDecimal totalMoney, String status, String description, String reasonOfChange, String historyLogChange) {
        this.uniqueID = uniqueID;
        this.customer = customer;
        this.admin = admin;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.paymentDate = paymentDate;
        this.paymentType = paymentType;
        this.shippingAddress = shippingAddress;
        this.shippingPhoneNumber = shippingPhoneNumber;
        this.shippingFee = shippingFee;
        this.totalMoney = totalMoney;
        this.status = status;
        this.description = description;
        this.reasonOfChange = reasonOfChange;
        this.historyLogChange = historyLogChange;
    }

    public Integer getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(Integer uniqueID) {
        this.uniqueID = uniqueID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
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

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getShippingPhoneNumber() {
        return shippingPhoneNumber;
    }

    public void setShippingPhoneNumber(String shippingPhoneNumber) {
        this.shippingPhoneNumber = shippingPhoneNumber;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
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

    public String getReasonOfChange() {
        return reasonOfChange;
    }

    public void setReasonOfChange(String reasonOfChange) {
        this.reasonOfChange = reasonOfChange;
    }

    public String getHistoryLogChange() {
        return historyLogChange;
    }

    public void setHistoryLogChange(String historyLogChange) {
        this.historyLogChange = historyLogChange;
    }

}
