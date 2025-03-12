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
public class User {

    private String userName;
    private Set<Role> roles = new HashSet<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addRoles(Role role) {
        roles.add(role);
    }

    public Boolean haspermission(String per) {
        for (Role role : roles) {
            if (role.haspermission(per)) {
                return true;
            }
        }
        return false;
    }
}
