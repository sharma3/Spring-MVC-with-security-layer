/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.jsharma3.mp4.MLM.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Jay
 */
@Entity
@Table(name = "users")
@NamedQuery(name = "User.findAll", query = "select u from User u")
public class User implements Serializable {
    
    @Id
    private String userName;
    private String password;
    
    @ManyToMany
    @JoinTable(name = "user_group", joinColumns = @JoinColumn(name = "USERNAME"),
            inverseJoinColumns = @JoinColumn(name = "GROUPNAME"))
    private List<Group> groups = new ArrayList<>();
    
    /**
     * Get the value of groups
     *
     * @return the value of groups
     */
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    public User() {
    }

    public void addGroups(Group g) {
        if (!this.groups.contains(g)) {
            this.groups.add(g);
        }
        if (!g.getUsers().contains(this)) {
            g.getUsers().add(this);
        }
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public List<Group> getGroups() {
        return groups;
    }
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
   
    @PrePersist
    @PreUpdate
    private void hashPassword(){
        String digestPassword = DigestUtils.md5Hex(this.password);
        this.password = digestPassword;
    }
 


}
