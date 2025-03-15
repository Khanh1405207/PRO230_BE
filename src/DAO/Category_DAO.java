/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Model.Category;
import Utility.DBcontext;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class Category_DAO {

    String selectCategory = "SELECT ID, Name, SearchCount, Status, Description FROM Category";

    String SqlInsertCategory = "INSERT INTO Category (ID, Name, SearchCount, Status, Description) VALUES (?, ?, ?, ?, ?)";

    String SqlUpdateCategory = "UPDATE Category SET Name = ?, SearchCount = ?, Status = ?, Description = ? WHERE ID = ?";

    String SqlDeleteCategory = "DELETE FROM Category WHERE ID = ?";
    
    Connection cn = DBcontext.getConnection();
    
    public ArrayList<Category> selectCategory() {
        ArrayList<Category> categoryList = new ArrayList<>();
        try {
            PreparedStatement stm = cn.prepareStatement(selectCategory);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt("ID"));
                category.setName(rs.getString("Name"));
                category.setSearchCount(rs.getInt("SearchCount"));
                category.setDescription(rs.getString("Description"));
                category.setStatus(rs.getString("Status"));
                categoryList.add(category);
            }
            return categoryList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean SqlInsertCategory(int Id, String Name, int SearchCount, String Description, String Status) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlInsertCategory);
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
    
    public boolean SqlUpdateCategory(int Id, String Name, int SearchCount, String Description, String Status) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlUpdateCategory);
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
    
    public boolean SqlDeleteCategory(int Id) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlDeleteCategory);
            stm.setInt(1, Id);
            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
