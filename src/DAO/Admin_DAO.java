/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Admin;
import Utility.DBcontext;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Admin_DAO {

    String selectAdmin = "SELECT IdAdmin, Name, DoB, Sex, CreateDate, Email, PhoneNumber, Address, Status, "
            + "Description, Image, Password, UserName, EmailConfirmed, PhoneNumberConfirmed, "
            + "PasswordHash, LogOut, AccessFailCount FROM Admin";

    String SqlInsertAdmin = "INSERT INTO Admin (IdAdmin, Name, DoB, Sex, CreateDate, Email, PhoneNumber, Address, Status, Description, Image, Password, UserName, EmailConfirmed, PhoneNumberConfirmed, PasswordHash, LogOut, AccessFailCount) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    String SqlUpdateAdmin = "UPDATE Admin SET Name = ?, DoB = ?, Sex = ?, Email = ?, PhoneNumber = ?, Address = ?, Status = ?, Description = ?, Image = ?, Password = ?, UserName = ?, EmailConfirmed = ?, PhoneNumberConfirmed = ?, PasswordHash = ?, LogOut = ?, AccessFailCount = ? WHERE IdAdmin = ?";

    String SqlDeleteAdmin = "DELETE FROM Admin WHERE IdAdmin = ?";

    Connection cn = DBcontext.getConnection();

    public ArrayList<Admin> selectAdmin() {
        ArrayList<Admin> adminList = new ArrayList<>();
        try {
            PreparedStatement stm = cn.prepareStatement(selectAdmin);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Admin a = new Admin();
                a.setIdAdmin(rs.getInt("IdAdmin"));
                a.setName(rs.getString("Name"));
                java.sql.Date dobDate = rs.getDate("DoB");
                if (dobDate != null) {
                    a.setDoB(dobDate.toLocalDate());
                }

                a.setSex(rs.getString("Sex"));

                java.sql.Timestamp createTimestamp = rs.getTimestamp("CreateDate");
                if (createTimestamp != null) {
                    a.setCreateDate(createTimestamp.toLocalDateTime());
                }
                a.setEmail(rs.getString("Email"));
                a.setPhoneNumber(rs.getString("PhoneNumber"));
                a.setAddress(rs.getString("Address"));
                a.setStatus(rs.getString("Status"));
                a.setDescription(rs.getString("Description"));
                a.setImage(rs.getString("Image"));
                a.setPassword(rs.getString("Password"));
                a.setUserName(rs.getString("UserName"));
                a.setEmailConfirmed(rs.getBoolean("EmailConfirmed"));
                a.setPhoneNumberConfirmed(rs.getBoolean("PhoneNumberConfirmed"));
                a.setLogOut(rs.getBoolean("Logout"));
                a.setAccessFailCount(rs.getInt("AccessFailCount"));
                adminList.add(a);
            }
            return adminList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet selectAdminUser(String email, String password) {
        try {
            String sql = "SELECT UserName,Email,[Password] FROM Admin WHERE Email=? AND [Password]=?";
            PreparedStatement stm = cn.prepareStatement(sql);
            stm.setString(1, email);
            stm.setString(2, password);
            ResultSet rs=stm.executeQuery();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean SqlInsertAdmin(int IdAdmin, String Name, Date DoB, String Sex, Date CreateDate, String Email, String PhoneNumber, String Address, String Status, String Description, String Image, String Password, String UserName, boolean EmailConfirmed, boolean PhoneNumberConfirmed) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlInsertAdmin);
            //  Điền dữ liệu cho Satementy
            stm.setInt(1, IdAdmin);
            stm.setString(2, Name);
            stm.setString(3, Name);
            stm.setDate(4, DoB);
            stm.setString(5, Sex);
            stm.setDate(6, CreateDate);
            stm.setString(7, Email);
            stm.setString(8, PhoneNumber);
            stm.setString(9, Address);
            stm.setString(10, Status);
            stm.setString(11, Description);
            stm.setString(12, Image);
            stm.setString(13, Password);
            stm.setString(14, UserName);
            stm.setBoolean(15, EmailConfirmed);
            stm.setBoolean(16, PhoneNumberConfirmed);
            int row = stm.executeUpdate(); //Trả về số dòng được tác động hay row affected
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean SqlUpdateAdmin(String Name, Date DoB, String Sex, Date CreateDate, String Email, String PhoneNumber, String Address, String Status, String Description, String Image, String Password, String UserName, boolean EmailConfirmed, boolean PhoneNumberConfirmed, String PasswordHash, boolean LogOut, int AccessFailCount, int IdAdmin) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlUpdateAdmin);
            //  Điền dữ liệu cho Satementy
            stm.setString(1, Name);
            stm.setString(2, Name);
            stm.setDate(3, DoB);
            stm.setString(4, Sex);
            stm.setDate(5, CreateDate);
            stm.setString(6, Email);
            stm.setString(7, PhoneNumber);
            stm.setString(8, Address);
            stm.setString(9, Status);
            stm.setString(10, Description);
            stm.setString(11, Image);
            stm.setString(12, Password);
            stm.setString(13, UserName);
            stm.setBoolean(14, EmailConfirmed);
            stm.setString(15, PasswordHash);
            stm.setBoolean(16, LogOut);
            stm.setInt(17, AccessFailCount);
            stm.setInt(18, IdAdmin);
            int row = stm.executeUpdate(); //Trả về số dòng được tác động hay row affected
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean SqlDeleteAdmin(int IdAdmin) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlDeleteAdmin);
            stm.setInt(1, IdAdmin);
            int row = stm.executeUpdate(); //Trả về số dòng được tác động hay row affected
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
