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
public class Evaluate {

    private Integer row;
    private String comment;
    private Integer rating;
    private LocalDateTime updateDate;
    private int productID;
    private int customerID;

    public Evaluate() {
    }

    public Evaluate(Integer row, String comment, Integer rating, LocalDateTime updateDate, int productID, int customerID) {
        this.row = row;
        this.comment = comment;
        this.rating = rating;
        this.updateDate = updateDate;
        this.productID = productID;
        this.customerID = customerID;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    

}
