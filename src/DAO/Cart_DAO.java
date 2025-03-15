/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Model.Cart;
import Utility.DBcontext;
import java.sql.*;
import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 *
 * @author ADMIN
 */
public class Cart_DAO {

    String selectCart = "SELECT Id, CustomerId, CartID, CreateDate, UpdateDate, Status FROM Cart";

    String SqlInsertCart = "INSERT INTO Cart (Id, CustomerId, CartID, CreateDate, UpdateDate, Status) VALUES (?, ?, ?, ?, ?, ?)";

    String SqlUpdateCart = "UPDATE Cart SET CustomerId = ?, CartID = ?, CreateDate = ?, UpdateDate = ?, Status = ? WHERE Id = ?";

    String SqlDeleteCart = "DELETE FROM Cart WHERE Id = ?";

    Connection cn = DBcontext.getConnection();
    
    public ArrayList<Cart> selectCart() {
        ArrayList<Cart> cartList = new ArrayList<>();
        try {
            PreparedStatement stm = cn.prepareStatement(selectCart);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Cart cart = new Cart();
                cart.setId(rs.getInt("Id"));
                cart.setCustomer(rs.getInt("CustomerId"));
                cart.setCartID(rs.getString("CartID"));
                cart.setCreateDate(rs.getTimestamp("CreateDate").toLocalDateTime());
                cart.setUpdateDate(rs.getTimestamp("UpdateDate").toLocalDateTime());
                cart.setStatus(rs.getString("Status"));

                cartList.add(cart);
            }
            return cartList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean SqlInsertCart(int Id, int CustomerId, String CartID, LocalDateTime CreateDate, LocalDateTime UpdateDate, String Status) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlInsertCart);
            stm.setInt(1, Id);
            stm.setInt(2, CustomerId);
            stm.setString(3, CartID);
            stm.setTimestamp(4, Timestamp.valueOf(CreateDate));
            stm.setTimestamp(5, Timestamp.valueOf(UpdateDate));
            stm.setString(6, Status);

            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean SqlUpdateCart(int Id, int CustomerId, String CartID, LocalDateTime CreateDate, LocalDateTime UpdateDate, String Status) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlUpdateCart);
            stm.setInt(1, CustomerId);
            stm.setString(2, CartID);
            stm.setTimestamp(3, Timestamp.valueOf(CreateDate));
            stm.setTimestamp(4, Timestamp.valueOf(UpdateDate));
            stm.setString(5, Status);
            stm.setInt(6, Id);

            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean SqlDeleteCart(int Id) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlDeleteCart);
            stm.setInt(1, Id);

            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
