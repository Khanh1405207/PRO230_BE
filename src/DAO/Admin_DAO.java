/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DAO;

/**
 *
 * @author ADMIN
 */
public class Admin_DAO {

    String selectAdmin = "SELECT IdAdmin, Name, DoB, Sex, CreateDate, Email, PhoneNumber, Address, Status, "
            + "Description, Image, Password, UserName, EmailConfirmed, PhoneNumberConfirmed, "
            + "PasswordHash, LogOut, AccessFailCount FROM Admin";
    
    String SqlInsertAdmin = "INSERT INTO Admin (IdAdmin, Name, DoB, Sex, CreateDate, Email, PhoneNumber, Address, Status, Description, Image, Password, UserName, EmailConfirmed, PhoneNumberConfirmed, PasswordHash, LogOut, AccessFailCount) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    String SqlUpdateAdmin = "UPDATE Admin SET Name = ?, DoB = ?, Sex = ?, Email = ?, PhoneNumber = ?, Address = ?, Status = ?, Description = ?, Image = ?, Password = ?, UserName = ?, EmailConfirmed = ?, PhoneNumberConfirmed = ?, PasswordHash = ?, LogOut = ?, AccessFailCount = ? WHERE IdAdmin = ?";

    String SqlDeleteAdmin = "DELETE FROM Admin WHERE IdAdmin = ?";

}
