/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Model.Customer;
import Utility.DBcontext;
import java.sql.*;
import java.util.ArrayList;
import java.time.LocalDateTime;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Customer_DAO {

    String dangKy = "INSERT INTO Customer (Name, Email, PhoneNumber, [Password], UserName)\n"
            + "VALUES (?,?,?,?,?)";
    
    String selectCustomer = "SELECT IdCustomer, Name, DoB, Sex, CreateDate, Email, PhoneNumber, Address, Status, "
            + "Description, Image, Password, UserName, EmailConfirmed, PhoneNumberConfirmed, "
            + "PasswordHash, LogOut, AccessFailCount FROM Customer";

    String selectCustomerById = "SELECT IdCustomer, Name, DoB, Sex, CreateDate, Email, PhoneNumber, Address, Status, "
            + "Description, Image, Password, UserName, EmailConfirmed, PhoneNumberConfirmed, "
            + "PasswordHash, LogOut, AccessFailCount FROM Customer WHERE IdCustomer=?";

    String SqlInsertCustomer = "INSERT INTO Customer (IdCustomer, Name, DoB, Sex, CreateDate, Email, PhoneNumber, Address, Status, Description, Image, Password, UserName, EmailConfirmed, PhoneNumberConfirmed, PasswordHash, LogOut, AccessFailCount) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    String SqlUpdateCustomer = "UPDATE Customer SET Name = ?, DoB = ?, Sex = ?, Email = ?, PhoneNumber = ?, Address = ?, Status = ?, Description = ?, Image = ?, Password = ?, UserName = ?, EmailConfirmed = ?, PhoneNumberConfirmed = ?, PasswordHash = ?, LogOut = ?, AccessFailCount = ? WHERE IdCustomer = ?";

    String SqlDeleteCustomer = "DELETE FROM Customer WHERE IdCustomer = ?";

    Connection cn = DBcontext.getConnection();

    public ArrayList<Customer> selectCustomer() {
        ArrayList<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement stm = cn.prepareStatement(selectCustomer);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setIdCustomer(rs.getInt("IdCustomer"));
                customer.setName(rs.getString("Name"));
                Date sqlDoB = rs.getDate("DoB");
                customer.setDoB(sqlDoB != null ? sqlDoB.toLocalDate() : null);
                customer.setSex(rs.getString("Sex"));
                customer.setCreateDate(rs.getTimestamp("CreateDate").toLocalDateTime());
                customer.setEmail(rs.getString("Email"));
                customer.setPhoneNumber(rs.getString("PhoneNumber"));
                customer.setAddress(rs.getString("Address"));
                customer.setStatus(rs.getString("Status"));
                customer.setDescription(rs.getString("Description"));
                customer.setImage(rs.getString("Image"));
                customer.setPassword(rs.getString("Password"));
                customer.setUserName(rs.getString("UserName"));
                customer.setEmailConfirmed(rs.getBoolean("EmailConfirmed"));
                customer.setPhoneNumberConfirmed(rs.getBoolean("PhoneNumberConfirmed"));
                customer.setPasswordHash(rs.getString("PasswordHash"));
                customer.setLogOut(rs.getBoolean("LogOut"));
                customer.setAccessFailCount(rs.getInt("AccessFailCount"));
                customerList.add(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public ResultSet selectCustomerUser(String email, String password) {
        try {
            String sql = "SELECT IdCustomer, Name, DoB, Sex, CreateDate, Email, PhoneNumber, Address, Status, "
                    + "Description, Image, Password, UserName, EmailConfirmed, PhoneNumberConfirmed, "
                    + "PasswordHash, LogOut, AccessFailCount FROM Customer WHERE Email=? AND [Password]=?";
            PreparedStatement stm = cn.prepareStatement(sql);
            stm.setString(1, email);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean dangKy(Customer customer) {
        try {
            PreparedStatement ps = cn.prepareStatement(dangKy);
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getEmail());
            ps.setString(3, customer.getPhoneNumber());
            ps.setString(4, customer.getPassword());
            ps.setString(5, customer.getUserName());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean insertCustomer(Customer customer) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlInsertCustomer);
            stm.setInt(1, customer.getIdCustomer());
            stm.setString(2, customer.getName());
            stm.setDate(3, Date.valueOf(customer.getDoB()));
            stm.setString(4, customer.getSex());
            stm.setTimestamp(5, Timestamp.valueOf(customer.getCreateDate()));
            stm.setString(6, customer.getEmail());
            stm.setString(7, customer.getPhoneNumber());
            stm.setString(8, customer.getAddress());
            stm.setString(9, customer.getStatus());
            stm.setString(10, customer.getDescription());
            stm.setString(11, customer.getImage());
            stm.setString(12, customer.getPassword());
            stm.setString(13, customer.getUserName());
            stm.setBoolean(12, customer.getEmailConfirmed());
            stm.setBoolean(13, customer.getPhoneNumberConfirmed());
            stm.setString(16, customer.getPasswordHash());
            stm.setBoolean(17, customer.getLogOut());
            stm.setInt(18, customer.getAccessFailCount());
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateCustomer(Customer customer) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlUpdateCustomer);
            stm.setString(1, customer.getName());
            stm.setDate(2, Date.valueOf(customer.getDoB()));
            stm.setString(3, customer.getSex());
            stm.setString(4, customer.getEmail());
            stm.setString(5, customer.getPhoneNumber());
            stm.setString(6, customer.getAddress());
            stm.setString(7, customer.getStatus());
            stm.setString(8, customer.getDescription());
            stm.setString(9, customer.getImage());
            stm.setString(10, customer.getPassword());
            stm.setString(11, customer.getUserName());
            stm.setBoolean(12, customer.getEmailConfirmed());
            stm.setBoolean(13, customer.getPhoneNumberConfirmed());
            stm.setString(14, customer.getPasswordHash());
            stm.setBoolean(15, customer.getLogOut());
            stm.setInt(16, customer.getAccessFailCount());
            stm.setInt(17, customer.getIdCustomer());
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteCustomer(int idCustomer) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlDeleteCustomer);
            stm.setInt(1, idCustomer);
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
