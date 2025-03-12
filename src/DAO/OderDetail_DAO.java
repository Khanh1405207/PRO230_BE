/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
public class OderDetail_DAO {

    String SqlInsertOrderDetail = "INSERT INTO OrderDetail (OrderId, ProductVariationId, Price, Quantity, TotalMoney, Status) "
            + "VALUES (?, ?, ?, ?, ?, ?)";
    String SqlUpdateOrderDetail = "UPDATE OrderDetail SET ProductVariationId = ?, Price = ?, Quantity = ?, TotalMoney = ?, Status = ? "
            + "WHERE OrderId = ?";
    String SqlDeleteOrderDetail = "DELETE FROM OrderDetail WHERE OrderId = ?";
}
