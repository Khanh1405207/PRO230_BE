/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
public class Category_DAO {

    String SqlInsertCategory = "INSERT INTO Category (ID, Name, SearchCount, Status, Description) VALUES (?, ?, ?, ?, ?)";

    String SqlUpdateCategory = "UPDATE Category SET Name = ?, SearchCount = ?, Status = ?, Description = ? WHERE ID = ?";

    String SqlDeleteCategory = "DELETE FROM Category WHERE ID = ?";
}
