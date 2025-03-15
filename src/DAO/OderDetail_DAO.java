/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Model.OrderDetail;
import Utility.DBcontext;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class OderDetail_DAO {

    String selectOrderDetail = "SELECT OrderID, ProductVariationId, Price, Quantity, TotalMoney, Status FROM OrderDetail";

    String SqlInsertOrderDetail = "INSERT INTO OrderDetail (OrderId, ProductVariationId, Price, Quantity, TotalMoney, Status) "
            + "VALUES (?, ?, ?, ?, ?, ?)";

    String SqlUpdateOrderDetail = "UPDATE OrderDetail SET ProductVariationId = ?, Price = ?, Quantity = ?, TotalMoney = ?, Status = ? "
            + "WHERE OrderId = ?";

    String SqlDeleteOrderDetail = "DELETE FROM OrderDetail WHERE OrderId = ?";
    
    Connection cn = DBcontext.getConnection();

    public ArrayList<OrderDetail> selectOrderDetail() {
        ArrayList<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            PreparedStatement stm = cn.prepareStatement(selectOrderDetail);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setOrderID(rs.getInt("OrderID"));
                orderDetail.setProductVariationID(rs.getInt("ProductVariationID"));
                orderDetail.setPrice(rs.getBigDecimal("Price"));
                orderDetail.setQuantity(rs.getInt("Quantity"));
                orderDetail.setTotalMoney(rs.getBigDecimal("TotalMoney"));
                orderDetail.setStatus(rs.getString("Status"));
                orderDetailList.add(orderDetail);
            }
            return orderDetailList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean sqlInsertOrderDetail(int orderID, int productVariationID, BigDecimal price, int quantity, BigDecimal totalMoney, String status) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlInsertOrderDetail);
            stm.setInt(1, orderID);
            stm.setInt(2, productVariationID);
            stm.setBigDecimal(3, price);
            stm.setInt(4, quantity);
            stm.setBigDecimal(5, totalMoney);
            stm.setString(6, status);
            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean sqlUpdateOrderDetail(int orderID, int productVariationID, BigDecimal price, int quantity, BigDecimal totalMoney, String status) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlUpdateOrderDetail);
            stm.setInt(1, productVariationID);
            stm.setBigDecimal(2, price);
            stm.setInt(3, quantity);
            stm.setBigDecimal(4, totalMoney);
            stm.setString(5, status);
            stm.setInt(6, orderID);
            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean sqlDeleteOrderDetail(int orderID) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlDeleteOrderDetail);
            stm.setInt(1, orderID);
            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
