/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.DeliveryAddress;
import Utility.DBcontext;
import java.sql.*;
import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 *
 * @author ADMIN
 */
public class DeliveryAddress_DAO {

    String selectDeliveryAddress = "SELECT Id, CustomerId, Name, ProvinceID, ProvinceName, DistrictID, "
            + "DistrictName, WardCode, Address, PhoneNumber, Description, Image, "
            + "CreateDate, UpdateDate FROM DeliveryAddress";

    String SqlInsertDeliveryAddress = "INSERT INTO DeliveryAddress (Id, CustomerId, Name, ProvinceID, ProvinceName, DistrictID, DistrictName, WardCode, Address, PhoneNumber, Description, Image, CreateDate, UpdateDate) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    String SqlUpdateDeliveryAddress = "UPDATE DeliveryAddress SET CustomerId = ?, Name = ?, ProvinceID = ?, ProvinceName = ?, DistrictID = ?, DistrictName = ?, WardCode = ?, Address = ?, PhoneNumber = ?, Description = ?, Image = ?, CreateDate = ?, UpdateDate = ? WHERE Id = ?";

    String SqlDeleteDeliveryAddress = "DELETE FROM DeliveryAddress WHERE Id = ?";

    Connection cn = DBcontext.getConnection();

    public ArrayList<DeliveryAddress> selectDeliveryAddress() {
        ArrayList<DeliveryAddress> addressList = new ArrayList<>();
        try {
            PreparedStatement stm = cn.prepareStatement(selectDeliveryAddress);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                DeliveryAddress address = new DeliveryAddress();
                address.setId(rs.getInt("Id"));
                address.setCustomerID(rs.getInt("CustomerId"));
                address.setName(rs.getString("Name"));
                address.setProvinceID(rs.getInt("ProvinceID"));
                address.setProvinceName(rs.getString("ProvinceName"));
                address.setDistrictID(rs.getInt("DistrictID"));
                address.setDistrictName(rs.getString("DistrictName"));
                address.setWardCode(rs.getString("WardCode"));
                address.setAddress(rs.getString("Address"));
                address.setPhoneNumber(rs.getString("PhoneNumber"));
                address.setDescription(rs.getString("Description"));
                address.setImage(rs.getString("Image"));
                address.setCreateDate(rs.getTimestamp("CreateDate").toLocalDateTime());
                address.setUpdateDate(rs.getTimestamp("UpdateDate").toLocalDateTime());
                addressList.add(address);
            }
            return addressList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean SqlInsertDeliveryAddress(int id, int customerId, String name, int provinceID, String provinceName, int districtID, String districtName, String wardCode, String address, String phoneNumber, String description, String image, LocalDateTime createDate, LocalDateTime updateDate) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlInsertDeliveryAddress);
            stm.setInt(1, id);
            stm.setInt(2, customerId);
            stm.setString(3, name);
            stm.setInt(4, provinceID);
            stm.setString(5, provinceName);
            stm.setInt(6, districtID);
            stm.setString(7, districtName);
            stm.setString(8, wardCode);
            stm.setString(9, address);
            stm.setString(10, phoneNumber);
            stm.setString(11, description);
            stm.setString(12, image);
            stm.setTimestamp(13, Timestamp.valueOf(createDate));
            stm.setTimestamp(14, Timestamp.valueOf(updateDate));
            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateDeliveryAddress(int Id, int CustomerId, String Name, int ProvinceID, String ProvinceName, int DistrictID, String DistrictName, String WardCode, String Address, String PhoneNumber, String Description, String Image, LocalDateTime CreateDate, LocalDateTime UpdateDate) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlUpdateDeliveryAddress);
            stm.setString(1, Name);
            stm.setInt(2, ProvinceID);
            stm.setString(3, ProvinceName);
            stm.setInt(4, DistrictID);
            stm.setString(5, DistrictName);
            stm.setString(6, WardCode);
            stm.setString(7, Address);
            stm.setString(8, PhoneNumber);
            stm.setString(9, Description);
            stm.setString(10, Image);
            stm.setObject(11, CreateDate);
            stm.setObject(12, UpdateDate);
            stm.setInt(13, Id);

            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteDeliveryAddress(int Id) {
        try {
            PreparedStatement stm = cn.prepareStatement(SqlDeleteDeliveryAddress);
            stm.setInt(1, Id);
            int row = stm.executeUpdate();
            return row > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
