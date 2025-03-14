/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDateTime;

/**
 *
 * @author ADMIN
 */
public class Color {

    private Integer id;
    private String name;
    private String hexCode;
    private String status;
    private String image;
    private LocalDateTime createOrUpdate;

    public Color() {
    }

    public Color(Integer id, String name, String hexCode, String status, String image, LocalDateTime createOrUpdate) {
        this.id = id;
        this.name = name;
        this.hexCode = hexCode;
        this.status = status;
        this.image = image;
        this.createOrUpdate = createOrUpdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHexCode() {
        return hexCode;
    }

    public void setHexCode(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDateTime getCreateOrUpdate() {
        return createOrUpdate;
    }

    public void setCreateOrUpdate(LocalDateTime createOrUpdate) {
        this.createOrUpdate = createOrUpdate;
    }

}
