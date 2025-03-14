/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
public class CartDetail_DAO {

    String selectCartDetail = "SELECT UniqueID, CartID, ProductVariationId, Price, Quantity, TotalMoney, Status FROM CartDetail";

    String SqlInsertCartDetail = "INSERT INTO CartDetail (UniqueID, CartID, ProductVariationId, Price, Quantity, TotalMoney, Status) VALUES (?, ?, ?, ?, ?, ?, ?)";

    String SqlUpdateCartDetail = "UPDATE CartDetail SET CartID = ?, ProductVariationId = ?, Price = ?, Quantity = ?, TotalMoney = ?, Status = ? WHERE UniqueID = ?";

    String SqlDeleteCartDetail = "DELETE FROM CartDetail WHERE UniqueID = ?";
}
