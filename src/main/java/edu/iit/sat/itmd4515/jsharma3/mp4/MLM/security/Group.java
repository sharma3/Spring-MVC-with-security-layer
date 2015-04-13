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
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jay
 */
@Entity
@Table(name = "groups")
@NamedQuery(name = "Group.findAll", query = "select g from Group g")
public class Group implements Serializable {
    
    @Id
    private String groupName;
    private String groupDes;

    @ManyToMany(mappedBy = "groups")
    private List<User> users = new ArrayList<>();

    /**
     * Get the value of users
     *
     * @return the value of users
     */
  
    public Group() {
    }

    public Group(String groupName, String groupDes) {
        this.groupName = groupName;
        this.groupDes = groupDes;
    }

    
    public void addUser(User u) {
        if (!this.users.contains(u)) {
            this.users.add(u);
        }
        if (!u.getGroups().contains(this)) {
            u.getGroups().add(this);
        }
    }
    public String getGroupName() {
        return groupName;
    }

    /**
     * Set the value of groupName
     *
     * @param groupName new value of groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
       
    public String getGroupDes() {
        return groupDes;
    }

    /**
     * Set the value of groupDes
     *
     * @param groupDes new value of groupDes
     */
    public void setGroupDes(String groupDes) {
        this.groupDes = groupDes;
    }
    
    public List<User> getUsers() {
        return users;
    }
    
    public void setUsers(List<User> users) {
        this.users = users;
    }


}
