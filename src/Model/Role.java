/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ADMIN
 */
public class Role {

    private String roleName;
    private Set<String> permission = new HashSet<>();

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void addPermission(String per) {
        permission.add(per.toUpperCase());
    }

    public Boolean haspermission(String per) {
        return permission.contains(per);
    }
}
