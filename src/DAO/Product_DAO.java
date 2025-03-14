/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
public class Product_DAO {

    String selectProduct = "SELECT IdProduct, Name, CategoryId, ProductCode, BrandID, CreateDate, UpdateDate, "
            + "LikeCount, ViewCount, Price, Stock, Status, Description, ProductType FROM Product";

    String SqlInsertProduct = "INSERT INTO Product (IdProduct, Name, CategoryId, ProductCode, BrandID, CreateDate, UpdateDate, LikeCount, ViewCount, Price, Stock, Status, Description, ProductType) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    String SqlUpdateProduct = "UPDATE Product SET Name = ?, CategoryId = ?, ProductCode = ?, BrandID = ?, CreateDate = ?, UpdateDate = ?, LikeCount = ?, ViewCount = ?, Price = ?, Stock = ?, Status = ?, Description = ?, ProductType = ? WHERE IdProduct = ?";

    String SqlDeleteProduct = "DELETE FROM Product WHERE IdProduct = ?";

}
