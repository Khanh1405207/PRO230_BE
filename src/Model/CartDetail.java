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
public class CartDetail {

    private Integer uniqueID;
    private Cart cart;
    private ProductVariation productVariation;
    private BigDecimal price;
    private Integer quantity;
    private BigDecimal totalMoney;
    private String status;

    public CartDetail() {
    }

    public CartDetail(Integer uniqueID, Cart cart, ProductVariation productVariation, BigDecimal price, Integer quantity, BigDecimal totalMoney, String status) {
        this.uniqueID = uniqueID;
        this.cart = cart;
        this.productVariation = productVariation;
        this.price = price;
        this.quantity = quantity;
        this.totalMoney = totalMoney;
        this.status = status;
    }

    public Integer getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(Integer uniqueID) {
        this.uniqueID = uniqueID;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public ProductVariation getProductVariation() {
        return productVariation;
    }

    public void setProductVariation(ProductVariation productVariation) {
        this.productVariation = productVariation;
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
