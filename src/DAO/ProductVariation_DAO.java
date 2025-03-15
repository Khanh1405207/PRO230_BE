/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.ProductVariation;
import Utility.DBcontext;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class ProductVariation_DAO {

    String selectProductVariation = "SELECT Id, ProductID, ColorId, Stock, CreateDate, UpdateDate, Image FROM ProductVariation";

    String SqlInsertProductVariation = "INSERT INTO ProductVariation (Id, ProductID, ColorId, Stock, CreateDate, UpdateDate, Image) VALUES (?, ?, ?, ?, ?, ?, ?)";

    String SqlUpdateProductVariation = "UPDATE ProductVariation SET ProductID = ?, ColorId = ?, Stock = ?, CreateDate = ?, UpdateDate = ?, Image = ? WHERE Id = ?";

    String SqlDeleteProductVariation = "DELETE FROM ProductVariation WHERE Id = ?";
    
    Connection cn = DBcontext.getConnection();
    
     public ArrayList<ProductVariation> selectProductVariation() {
        ArrayList<ProductVariation> list = new ArrayList<>();
        try {
            PreparedStatement stmt = cn.prepareStatement(selectProductVariation);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ProductVariation pv = new ProductVariation();
                pv.setId(rs.getInt("Id"));
                pv.setProductID(rs.getInt("ProductID"));
                pv.setColorID(rs.getInt("ColorId"));
                pv.setStock(rs.getInt("Stock"));
                pv.setCreateDate(rs.getTimestamp("CreateDate").toLocalDateTime());
                pv.setUpdateDate(rs.getTimestamp("UpdateDate").toLocalDateTime());
                pv.setImage(rs.getString("Image"));
                list.add(pv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean insertProductVariation(int id, int productID, int colorID, int stock, String createDate, String updateDate, String image) {
        try {
            PreparedStatement stmt = cn.prepareStatement(SqlInsertProductVariation);
            stmt.setInt(1, id);
            stmt.setInt(2, productID);
            stmt.setInt(3, colorID);
            stmt.setInt(4, stock);
            stmt.setString(5, createDate);
            stmt.setString(6, updateDate);
            stmt.setString(7, image);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateProductVariation(int id, int productID, int colorID, int stock, String createDate, String updateDate, String image) {
        try {
            PreparedStatement stmt = cn.prepareStatement(SqlUpdateProductVariation);
            stmt.setInt(1, productID);
            stmt.setInt(2, colorID);
            stmt.setInt(3, stock);
            stmt.setString(4, createDate);
            stmt.setString(5, updateDate);
            stmt.setString(6, image);
            stmt.setInt(7, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteProductVariation(int id) {
        try {
            PreparedStatement stmt = cn.prepareStatement(SqlDeleteProductVariation);
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
