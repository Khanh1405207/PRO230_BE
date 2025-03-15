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
    private int cartID;
    private int productVariationID;
    private BigDecimal price;
    private int quantity;
    private BigDecimal totalMoney;
    private String status;

    public CartDetail() {
    }

    public CartDetail(Integer uniqueID, int cartID, int productVariationID, BigDecimal price, int quantity, BigDecimal totalMoney, String status) {
        this.uniqueID = uniqueID;
        this.cartID = cartID;
        this.productVariationID = productVariationID;
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

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
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
