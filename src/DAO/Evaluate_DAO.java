/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Model.Evaluate;
import Utility.DBcontext;
import java.sql.*;
import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 *
 * @author ADMIN
 */
public class Evaluate_DAO {

    String selectEvaluate = "SELECT ProductID, CustomerID, Comment, Rating, Row, UpdateDate FROM Evaluate";

    String SqlInsertEvaluate = "INSERT INTO Evaluate (ProductID, CustomerID, Comment, Rating, UpdateDate) VALUES (?, ?, ?, ?, ?)";

    String SqlUpdateEvaluate = "UPDATE Evaluate SET Comment = ?, Rating = ?, UpdateDate = ? WHERE ProductID = ? AND CustomerID = ?";

    String SqlDeleteEvaluate = "DELETE FROM Evaluate WHERE ProductID = ? AND CustomerID = ?";
    
    Connection cn = DBcontext.getConnection();

    public ArrayList<Evaluate> selectEvaluate() {
        ArrayList<Evaluate> evaluateList = new ArrayList<>();
        try {
            PreparedStatement stm = cn.prepareStatement(selectEvaluate);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Evaluate evaluate = new Evaluate();
                evaluate.setProductID(rs.getInt("ProductID"));
                evaluate.setCustomerID(rs.getInt("CustomerID"));
                evaluate.setComment(rs.getString("Comment"));
                evaluate.setRating(rs.getInt("Rating"));
                evaluate.setRow(rs.getInt("Row"));
                evaluate.setUpdateDate(rs.getTimestamp("UpdateDate").toLocalDateTime());
                evaluateList.add(evaluate);
            }
            return evaluateList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean SqlInsertEvaluate (int ProductID,int CustomerID,String Comment,int Rating, LocalDateTime UpdateDate) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlInsertEvaluate);
            stm.setInt(1, ProductID);
            stm.setInt(2, CustomerID);
            stm.setString(3, Comment);
            stm.setInt(4, Rating);
            stm.setTimestamp(5, Timestamp.valueOf(UpdateDate));
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean SqlUpdateEvaluate(String Comment,int Rating, LocalDateTime UpdateDate, int ProductID, int CustomerID) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlUpdateEvaluate);
            stm.setString(1, Comment);
            stm.setInt(2, Rating);
            stm.setTimestamp(3, Timestamp.valueOf(UpdateDate));
            stm.setInt(4, ProductID);
            stm.setInt(5, CustomerID);
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean SqlDeleteEvaluate(int productID, int customerID) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlDeleteEvaluate);
            stm.setInt(1, productID);
            stm.setInt(2, customerID);
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
