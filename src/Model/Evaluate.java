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
    private Product product;
    private Customer customer;

    public Evaluate() {
    }

    public Evaluate(Integer row, String comment, Integer rating, LocalDateTime updateDate, Product product, Customer customer) {
        this.row = row;
        this.comment = comment;
        this.rating = rating;
        this.updateDate = updateDate;
        this.product = product;
        this.customer = customer;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
