/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Order;
import Utility.DBcontext;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 *
 * @author ADMIN
 */
public class Order_DAO {

    String selectOrder = "SELECT UniqueID, CustomerID, AdminID, CreateDate, UpdateDate, PaymentDate, PaymentType, "
            + "ShippingAddress, ShippingPhoneNumber, ShippingFee, TotalMoney, Status, Description, "
            + "ReasonOfChange, HistoryLogChange FROM [Order]";

    String SqlInsertOrder = "INSERT INTO `Order` (UniqueID, CustomerID, AdminID, CreateDate, UpdateDate, PaymentDate, PaymentType, ShippingAddress, ShippingPhoneNumber, ShippingFee, TotalMoney, Status, Description, ReasonOfChange) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    String SqlUpdateOrder = "UPDATE `Order` SET CustomerID = ?, AdminID = ?, CreateDate = ?, UpdateDate = ?, PaymentDate = ?, PaymentType = ?, ShippingAddress = ?, ShippingPhoneNumber = ?, ShippingFee = ?, TotalMoney = ?, Status = ?, Description = ?, ReasonOfChange = ? WHERE UniqueID = ?";

    String SqlDeleteOrder = "DELETE FROM `Order` WHERE UniqueID = ?";
    
    Connection cn = DBcontext.getConnection();

     public ArrayList<Order> selectOrder() {
        ArrayList<Order> orderList = new ArrayList<>();
        try {
            PreparedStatement stm = cn.prepareStatement(selectOrder);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Order order = new Order();
                order.setUniqueID(rs.getInt("UniqueID"));
                order.setCustomer(rs.getInt("CustomerID"));
                order.setAdmin(rs.getInt("AdminID"));
                order.setCreateDate(rs.getTimestamp("CreateDate").toLocalDateTime());
                order.setUpdateDate(rs.getTimestamp("UpdateDate").toLocalDateTime());
                order.setPaymentDate(rs.getTimestamp("PaymentDate").toLocalDateTime());
                order.setPaymentType(rs.getString("PaymentType"));
                order.setShippingAddress(rs.getString("ShippingAddress"));
                order.setShippingPhoneNumber(rs.getString("ShippingPhoneNumber"));
                order.setShippingFee(rs.getBigDecimal("ShippingFee"));
                order.setTotalMoney(rs.getBigDecimal("TotalMoney"));
                order.setStatus(rs.getString("Status"));
                order.setDescription(rs.getString("Description"));
                order.setReasonOfChange(rs.getString("ReasonOfChange"));
                order.setHistoryLogChange(rs.getString("HistoryLogChange"));
                orderList.add(order);
            }
            return orderList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // INSERT
    public boolean sqlInsertOrder(int uniqueID, int customerID, int adminID, Timestamp createDate, Timestamp updateDate, Timestamp paymentDate, String paymentType, String shippingAddress, String shippingPhoneNumber, BigDecimal shippingFee, BigDecimal totalMoney, String status, String description, String reasonOfChange, String historyLogChange) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlInsertOrder);
            stm.setInt(1, uniqueID);
            stm.setInt(2, customerID);
            stm.setInt(3, adminID);
            stm.setTimestamp(4, createDate);
            stm.setTimestamp(5, updateDate);
            stm.setTimestamp(6, paymentDate);
            stm.setString(7, paymentType);
            stm.setString(8, shippingAddress);
            stm.setString(9, shippingPhoneNumber);
            stm.setBigDecimal(10, shippingFee);
            stm.setBigDecimal(11, totalMoney);
            stm.setString(12, status);
            stm.setString(13, description);
            stm.setString(14, reasonOfChange);
            stm.setString(15, historyLogChange);
            int rows = stm.executeUpdate();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // UPDATE
    public boolean sqlUpdateOrder(int uniqueID, int customerID, int adminID, Timestamp updateDate, Timestamp paymentDate, String paymentType, String shippingAddress, String shippingPhoneNumber, BigDecimal shippingFee, BigDecimal totalMoney, String status, String description, String reasonOfChange, String historyLogChange) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlUpdateOrder);
            stm.setInt(1, customerID);
            stm.setInt(2, adminID);
            stm.setTimestamp(3, updateDate);
            stm.setTimestamp(4, paymentDate);
            stm.setString(5, paymentType);
            stm.setString(6, shippingAddress);
            stm.setString(7, shippingPhoneNumber);
            stm.setBigDecimal(8, shippingFee);
            stm.setBigDecimal(9, totalMoney);
            stm.setString(10, status);
            stm.setString(11, description);
            stm.setString(12, reasonOfChange);
            stm.setString(13, historyLogChange);
            stm.setInt(14, uniqueID);
            int rows = stm.executeUpdate();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // DELETE
    public boolean sqlDeleteOrder(int uniqueID) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlDeleteOrder);
            stm.setInt(1, uniqueID);
            int rows = stm.executeUpdate();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
