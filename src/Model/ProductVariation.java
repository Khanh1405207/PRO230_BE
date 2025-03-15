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
public class ProductVariation {

    private Integer id;
    private Integer stock;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private String image;
    private int productID;
    private int colorID;

    public ProductVariation() {
    }

    public ProductVariation(Integer id, Integer stock, LocalDateTime createDate, LocalDateTime updateDate, String image, int productID, int colorID) {
        this.id = id;
        this.stock = stock;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.image = image;
        this.productID = productID;
        this.colorID = colorID;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getColorID() {
        return colorID;
    }

    public void setColorID(int colorID) {
        this.colorID = colorID;
    }



}
