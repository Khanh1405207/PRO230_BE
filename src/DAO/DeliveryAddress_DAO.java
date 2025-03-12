/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
public class DeliveryAddress_DAO {

    String SqlInsertDeliveryAddress = "INSERT INTO DeliveryAddress (Id, CustomerId, Name, ProvinceID, ProvinceName, DistrictID, DistrictName, WardCode, Address, PhoneNumber, Description, Image, CreateDate, UpdateDate) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    String SqlUpdateDeliveryAddress = "UPDATE DeliveryAddress SET CustomerId = ?, Name = ?, ProvinceID = ?, ProvinceName = ?, DistrictID = ?, DistrictName = ?, WardCode = ?, Address = ?, PhoneNumber = ?, Description = ?, Image = ?, CreateDate = ?, UpdateDate = ? WHERE Id = ?";

    String SqlDeleteDeliveryAddress = "DELETE FROM DeliveryAddress WHERE Id = ?";
}
