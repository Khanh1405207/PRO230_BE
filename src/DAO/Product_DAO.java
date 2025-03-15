/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Product;
import Utility.DBcontext;
import Utility.DBcontext;
import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Product_DAO {

    String selectProduct = "SELECT IdProduct, Name, CategoryId, ProductCode, BrandID, CreateDate, UpdateDate, "
            + "LikeCount, ViewCount, Price, Stock, Status, Description, ProductType FROM Product";

    String SqlInsertProduct = "INSERT INTO Product (IdProduct, Name, CategoryId, ProductCode, BrandID, CreateDate, UpdateDate, LikeCount, ViewCount, Price, Stock, Status, Description, ProductType) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    String SqlUpdateProduct = "UPDATE Product SET Name = ?, CategoryId = ?, ProductCode = ?, BrandID = ?, CreateDate = ?, UpdateDate = ?, LikeCount = ?, ViewCount = ?, Price = ?, Stock = ?, Status = ?, Description = ?, ProductType = ? WHERE IdProduct = ?";

    String SqlDeleteProduct = "DELETE FROM Product WHERE IdProduct = ?";
    
    Connection cn = DBcontext.getConnection();
    
     public ArrayList<Product> selectProduct() {
        ArrayList<Product> productList = new ArrayList<>();
        try (
             PreparedStatement stm = cn.prepareStatement(selectProduct);
             ResultSet rs = stm.executeQuery()) {
            while (rs.next()) {
                Product product = new Product();
                product.setIdProduct(rs.getInt("IdProduct"));
                product.setName(rs.getString("Name"));
                product.setCategoryID(rs.getInt("CategoryID"));
                product.setProductCode(rs.getString("ProductCode"));
                product.setBrandID(rs.getInt("BrandID"));
                product.setCreateDate(rs.getTimestamp("CreateDate").toLocalDateTime());
                product.setUpdateDate(rs.getTimestamp("UpdateDate").toLocalDateTime());
                product.setLikeCount(rs.getInt("LikeCount"));
                product.setViewCount(rs.getInt("ViewCount"));
                product.setPrice(rs.getBigDecimal("Price"));
                product.setStock(rs.getInt("Stock"));
                product.setStatus(rs.getString("Status"));
                product.setDescription(rs.getString("Description"));
                product.setProductType(rs.getString("ProductType"));
                productList.add(product);
            }
            return productList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // INSERT
    public boolean sqlInsertProduct( int IdProduct,String Name,int  CategoryId,String ProductCode,int BrandID,LocalDateTime CreateDate,LocalDateTime UpdateDate,int LikeCount,int ViewCount,BigDecimal Price,int Stock,String Status,String Description,String ProductType) {
        try (
             PreparedStatement stm = cn.prepareStatement(SqlInsertProduct)) {

            stm.setInt(1, IdProduct);
            stm.setString(2, Name);
            stm.setInt(3, CategoryId);
            stm.setString(4, ProductCode);
            stm.setInt(5, BrandID);
            stm.setTimestamp(6, Timestamp.valueOf(CreateDate));
            stm.setTimestamp(7, Timestamp.valueOf(UpdateDate));
            stm.setInt(8, LikeCount);
            stm.setInt(9, ViewCount);
            stm.setBigDecimal(10, Price);
            stm.setInt(11, Stock);
            stm.setString(12, Status);
            stm.setString(13, Description);
            stm.setString(14, ProductType);
            
            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // UPDATE
    public boolean sqlUpdateProduct(String Name,int  CategoryId,String ProductCode,int BrandID,LocalDateTime CreateDate,LocalDateTime UpdateDate,int LikeCount,int ViewCount,BigDecimal Price,int Stock,String Status,String Description,String ProductType, int IdProduct) {
        try (
             PreparedStatement stm = cn.prepareStatement(SqlUpdateProduct)) {
            
            stm.setString(1, Name);
            stm.setInt(2, CategoryId);
            stm.setString(3, ProductCode);
            stm.setInt(4, BrandID);
            stm.setTimestamp(5, Timestamp.valueOf(CreateDate));
            stm.setTimestamp(6, Timestamp.valueOf(UpdateDate));
            stm.setInt(7, LikeCount);
            stm.setInt(8, ViewCount);
            stm.setBigDecimal(9, Price);
            stm.setInt(10, Stock);
            stm.setString(11, Status);
            stm.setString(12, Description);
            stm.setString(13, ProductType);
            stm.setInt(14, IdProduct);

            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // DELETE
    public boolean sqlDeleteProduct(int idProduct) {
        try (
             PreparedStatement stm = cn.prepareStatement(SqlDeleteProduct)) {

            stm.setInt(1, idProduct);
            
            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
