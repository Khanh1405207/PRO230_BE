/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
public class Order_DAO {

    String SqlInsertOrder = "INSERT INTO `Order` (UniqueID, CustomerID, AdminID, CreateDate, UpdateDate, PaymentDate, PaymentType, ShippingAddress, ShippingPhoneNumber, ShippingFee, TotalMoney, Status, Description, ReasonOfChange) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    String SqlUpdateOrder = "UPDATE `Order` SET CustomerID = ?, AdminID = ?, CreateDate = ?, UpdateDate = ?, PaymentDate = ?, PaymentType = ?, ShippingAddress = ?, ShippingPhoneNumber = ?, ShippingFee = ?, TotalMoney = ?, Status = ?, Description = ?, ReasonOfChange = ? WHERE UniqueID = ?";

    String SqlDeleteOrder = "DELETE FROM `Order` WHERE UniqueID = ?";

}
