/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Brand;
import Utility.DBcontext;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Brand_DAO {

    String selectBrand = "SELECT ID, Name, SearchCount, Description, Status FROM Brand";

    String SqlInsertBrand = "INSERT INTO Brand (Id, Name, SearchCount, Description, Status) VALUES (?, ?, ?, ?, ?)";

    String SqlUpdateBrand = "UPDATE Brand SET Name = ?, SearchCount = ?, Description = ?, Status = ? WHERE Id = ?";

    String SqlDeleteBrand = "DELETE FROM Brand WHERE Id = ?";
    
    Connection cn = DBcontext.getConnection();
    
    public ArrayList<Brand> selectBrand() {
        ArrayList<Brand> brandList = new ArrayList<>();
        try {
            PreparedStatement stm = cn.prepareStatement(selectBrand);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand();
                brand.setId(rs.getInt("ID"));
                brand.setName(rs.getString("Name"));
                brand.setSearchCount(rs.getInt("SearchCount"));
                brand.setDescription(rs.getString("Description"));
                brand.setStatus(rs.getString("Status"));
                brandList.add(brand);
            }
            return brandList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Phương thức INSERT
    public boolean SqlInsertBrand(int Id, String Name, int SearchCount, String Description, String Status) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlInsertBrand);
            // Điền dữ liệu cho Statement
            stm.setInt(1, Id);
            stm.setString(2, Name);
            stm.setInt(3, SearchCount);
            stm.setString(4, Description);
            stm.setString(5, Status);
            
            int row = stm.executeUpdate(); 
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

 
    public boolean SqlUpdateBrand(int Id, String Name, int SearchCount, String Description, String Status) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlUpdateBrand);
            stm.setString(1, Name);
            stm.setInt(2, SearchCount);
            stm.setString(3, Description);
            stm.setString(4, Status);
            stm.setInt(5, Id);
            
            int row = stm.executeUpdate(); 
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Phương thức DELETE
    public boolean SqlDeleteBrand(int Id) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlDeleteBrand);
            stm.setInt(1, Id);
            
            int row = stm.executeUpdate(); 
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
