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
public class Product {

    private Integer idProduct;
    private String name;
    private String productCode;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private Integer likeCount;
    private Integer viewCount;
    private BigDecimal price;
    private Integer stock;
    private String status;
    private String description;
    private String productType;
    private Category category;
    private Brand brand;

    public Product() {
    }

    public Product(Integer idProduct, String name, String productCode, LocalDateTime createDate, LocalDateTime updateDate, Integer likeCount, Integer viewCount, BigDecimal price, Integer stock, String status, String description, String productType, Category category, Brand brand) {
        this.idProduct = idProduct;
        this.name = name;
        this.productCode = productCode;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.likeCount = likeCount;
        this.viewCount = viewCount;
        this.price = price;
        this.stock = stock;
        this.status = status;
        this.description = description;
        this.productType = productType;
        this.category = category;
        this.brand = brand;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
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

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

}
