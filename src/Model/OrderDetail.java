/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;

/**
 *
 * @author ADMIN
 */
public class OrderDetail {

    private int orderID;
    private int productVariationID;
    private BigDecimal price;
    private Integer quantity;
    private BigDecimal totalMoney;
    private String status;

    public OrderDetail() {
    }

    public OrderDetail(int orderID, int productVariationID, BigDecimal price, Integer quantity, BigDecimal totalMoney, String status) {
        this.orderID = orderID;
        this.productVariationID = productVariationID;
        this.price = price;
        this.quantity = quantity;
        this.totalMoney = totalMoney;
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductVariationID() {
        return productVariationID;
    }

    public void setProductVariationID(int productVariationID) {
        this.productVariationID = productVariationID;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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

}
