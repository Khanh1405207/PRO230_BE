/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
public class Brand_DAO {

    String SqlInsertBrand = "INSERT INTO Brand (Id, Name, SearchCount, Description, Status) VALUES (?, ?, ?, ?, ?)";

    String SqlUpdateBrand = "UPDATE Brand SET Name = ?, SearchCount = ?, Description = ?, Status = ? WHERE Id = ?";

    String SqlDeleteBrand = "DELETE FROM Brand WHERE Id = ?";
}
