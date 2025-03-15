/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Model.Color;
import Utility.DBcontext;
import java.sql.*;
import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 *
 * @author ADMIN
 */
public class Color_DAO {
    
    String selectColor = "SELECT Id, Name, HexCode, Status, Image, CreateOrUpdate FROM Color";

    String SqlInsertColor = "INSERT INTO Color (Id, Name, HexCode, Status, Image, CreateOrUpdate) VALUES (?, ?, ?, ?, ?, ?)";

    String SqlUpdateColor = "UPDATE Color SET Name = ?, HexCode = ?, Status = ?, Image = ?, CreateOrUpdate = ? WHERE Id = ?";

    String SqlDeleteColor = "DELETE FROM Color WHERE Id = ?";

    Connection cn = DBcontext.getConnection();
    
    public ArrayList<Color> selectColor() {
        ArrayList<Color> colorList = new ArrayList<>();
        try {
            PreparedStatement stm = cn.prepareStatement(selectColor);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Color color = new Color();
                color.setId(rs.getInt("Id"));
                color.setName(rs.getString("Name"));
                color.setHexCode(rs.getString("HexCode"));
                color.setStatus(rs.getString("Status"));
                color.setImage(rs.getString("Image"));
                color.setCreateOrUpdate(rs.getTimestamp("CreateOrUpdate").toLocalDateTime());
                colorList.add(color);
            }
            return colorList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean SqlInsertColor(int id, String name, String hexCode, String status, String image, LocalDateTime createOrUpdate) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlInsertColor);
            stm.setInt(1, id);
            stm.setString(2, name);
            stm.setString(3, hexCode);
            stm.setString(4, status);
            stm.setString(5, image);
            stm.setTimestamp(6, Timestamp.valueOf(createOrUpdate));
            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean SqlUpdateColor(int id, String name, String hexCode, String status, String image, LocalDateTime createOrUpdate) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlUpdateColor);
            stm.setString(1, name);
            stm.setString(2, hexCode);
            stm.setString(3, status);
            stm.setString(4, image);
            stm.setTimestamp(5, Timestamp.valueOf(createOrUpdate));
            stm.setInt(6, id);
            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean SqlDeleteColor(int id) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlDeleteColor);
            stm.setInt(1, id);
            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
