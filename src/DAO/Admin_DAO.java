/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DAO;

import Utility.DBcontext;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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

//    public static boolean addCuaHang (String ten,String mota, String loaihang, Date ngaydangky, int idCN){
//        try {
//            Connection cn  = DriverManager.getConnection(DBcontext);
//            PreparedStatement stm = cn.prepareStatement(selectAdmin);
//            //  Điền dữ liệu cho Satementy
//            stm.setString(1, ten);
//            stm.setString(2, mota);
//            stm.setString(3, loaihang);
//            stm.setDate(4, ngaydangky);
//            stm.setInt(5, idCN);
//            int row = stm.executeUpdate(); //Trả về số dòng được tác động hay row affected
//            return row > 0;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//    public static boolean updateCuaHang (int id,String mota){
//        try {
//            Connection cn  = DriverManager.getConnection(connectionUrl);
//            PreparedStatement stm = cn.prepareStatement(updateCH);
//            //  Điền dữ liệu cho Satementy
//            stm.setString(1, mota);
//            stm.setInt(2, id);
//
//            int row = stm.executeUpdate(); //Trả về số dòng được tác động hay row affected
//            return row > 0;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//    public static boolean deleteCuaHang (int id){
//        try {
//            Connection cn  = DriverManager.getConnection(connectionUrl);
//            PreparedStatement stm = cn.prepareStatement(deleteCH);
//            //  Điền dữ liệu cho Statement
//            stm.setInt(1, id);
//            int row = stm.executeUpdate(); //Trả về số dòng được tác động hay row affected
//            return row > 0;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
}

