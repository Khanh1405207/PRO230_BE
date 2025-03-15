/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.CartDetail;
import Model.ProductVariation;
import Utility.DBcontext;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class CartDetail_DAO {

    String selectCartDetail = "SELECT UniqueID, CartID, ProductVariationId, Price, Quantity, TotalMoney, Status FROM CartDetail";

    String SqlInsertCartDetail = "INSERT INTO CartDetail (UniqueID, CartID, ProductVariationId, Price, Quantity, TotalMoney, Status) VALUES (?, ?, ?, ?, ?, ?, ?)";

    String SqlUpdateCartDetail = "UPDATE CartDetail SET CartID = ?, ProductVariationId = ?, Price = ?, Quantity = ?, TotalMoney = ?, Status = ? WHERE UniqueID = ?";

    String SqlDeleteCartDetail = "DELETE FROM CartDetail WHERE UniqueID = ?";
    
    Connection cn = DBcontext.getConnection();
    
    public ArrayList<CartDetail> selectCartDetail() {
        ArrayList<CartDetail> cartDetailList = new ArrayList<>();
        try {
            PreparedStatement stm = cn.prepareStatement(selectCartDetail);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                CartDetail cartDetail = new CartDetail();
                cartDetail.setUniqueID(rs.getInt("UniqueID"));
                cartDetail.setCartID(rs.getInt("CartID"));
                cartDetail.setProductVariationID(rs.getInt("ProductVariationId"));
                cartDetail.setPrice(rs.getBigDecimal("Price"));
                cartDetail.setQuantity(rs.getInt("Quantity"));
                cartDetail.setTotalMoney(rs.getBigDecimal("TotalMoney"));
                cartDetail.setStatus(rs.getString("Status"));
                cartDetailList.add(cartDetail);
            }
            return cartDetailList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public boolean SqlInsertCartDetail(int UniqueID, int CartID, int ProductVariationId, double Price, int Quantity, double TotalMoney, String Status) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlInsertCartDetail);
 
            stm.setInt(1, UniqueID);
            stm.setInt(2, CartID);
            stm.setInt(3, ProductVariationId);
            stm.setDouble(4, Price);
            stm.setInt(5, Quantity);
            stm.setDouble(6, TotalMoney);
            stm.setString(7, Status);
            
            int row = stm.executeUpdate(); 
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Phương thức UPDATE
    public boolean SqlUpdateCartDetail(int UniqueID, int CartID, int ProductVariationId, double Price, int Quantity, double TotalMoney, String Status) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlUpdateCartDetail);

            stm.setInt(1, CartID);
            stm.setInt(2, ProductVariationId);
            stm.setDouble(3, Price);
            stm.setInt(4, Quantity);
            stm.setDouble(5, TotalMoney);
            stm.setString(6, Status);
            stm.setInt(7, UniqueID);
            
            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    public boolean SqlDeleteCartDetail(int UniqueID) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlDeleteCartDetail);
 
            stm.setInt(1, UniqueID);
            
            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


}
