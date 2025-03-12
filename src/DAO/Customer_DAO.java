/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
public class Customer_DAO {

    String SqlInsertCustomer = "INSERT INTO Customer (IdCustomer, Name, DoB, Sex, CreateDate, Email, PhoneNumber, Address, Status, Description, Image, Password, UserName, EmailConfirmed, PhoneNumberConfirmed, PasswordHash, LogOut, AccessFailCount) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    String SqlUpdateCustomer = "UPDATE Customer SET Name = ?, DoB = ?, Sex = ?, Email = ?, PhoneNumber = ?, Address = ?, Status = ?, Description = ?, Image = ?, Password = ?, UserName = ?, EmailConfirmed = ?, PhoneNumberConfirmed = ?, PasswordHash = ?, LogOut = ?, AccessFailCount = ? WHERE IdCustomer = ?";

    String SqlDeleteCustomer = "DELETE FROM Customer WHERE IdCustomer = ?";

}
