/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
public class Color_DAO {

    String SqlInsertColor = "INSERT INTO Color (Id, Name, HexCode, Status, Image, CreateOrUpdate) VALUES (?, ?, ?, ?, ?, ?)";

    String SqlUpdateColor = "UPDATE Color SET Name = ?, HexCode = ?, Status = ?, Image = ?, CreateOrUpdate = ? WHERE Id = ?";

    String SqlDeleteColor = "DELETE FROM Color WHERE Id = ?";

}
