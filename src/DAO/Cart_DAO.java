/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
public class Cart_DAO {

    String selectCart = "SELECT Id, CustomerId, CartID, CreateDate, UpdateDate, Status FROM Cart";

    String SqlInsertCart = "INSERT INTO Cart (Id, CustomerId, CartID, CreateDate, UpdateDate, Status) VALUES (?, ?, ?, ?, ?, ?)";

    String SqlUpdateCart = "UPDATE Cart SET CustomerId = ?, CartID = ?, CreateDate = ?, UpdateDate = ?, Status = ? WHERE Id = ?";

    String SqlDeleteCart = "DELETE FROM Cart WHERE Id = ?";

}
