/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author ADMIN
 */
public class Evaluate_DAO {

    String selectEvaluate = "SELECT ProductID, CustomerID, Comment, Rating, Row, UpdateDate FROM Evaluate";

    String SqlInsertEvaluate = "INSERT INTO Evaluate (ProductID, CustomerID, Comment, Rating, UpdateDate) VALUES (?, ?, ?, ?, ?)";

    String SqlUpdateEvaluate = "UPDATE Evaluate SET Comment = ?, Rating = ?, UpdateDate = ? WHERE ProductID = ? AND CustomerID = ?";

    String SqlDeleteEvaluate = "DELETE FROM Evaluate WHERE ProductID = ? AND CustomerID = ?";
}
