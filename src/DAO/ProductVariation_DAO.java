/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
public class ProductVariation_DAO {

    String selectProductVariation = "SELECT Id, ProductID, ColorId, Stock, CreateDate, UpdateDate, Image FROM ProductVariation";

    String SqlInsertProductVariation = "INSERT INTO ProductVariation (Id, ProductID, ColorId, Stock, CreateDate, UpdateDate, Image) VALUES (?, ?, ?, ?, ?, ?, ?)";

    String SqlUpdateProductVariation = "UPDATE ProductVariation SET ProductID = ?, ColorId = ?, Stock = ?, CreateDate = ?, UpdateDate = ?, Image = ? WHERE Id = ?";

    String SqlDeleteProductVariation = "DELETE FROM ProductVariation WHERE Id = ?";

}
