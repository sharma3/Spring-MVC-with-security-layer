/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.jsharma3.mp4.MLM;

import edu.iit.sat.itmd4515.jsharma3.mp4.MLM.security.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author Jay
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Customer.findById", query = "select c from Customer c where c.id = :id "),
    @NamedQuery(name = "Customer.findByAll", query = "select c from Customer c "),
    @NamedQuery(name = "Customer.findByRFcode", query = "select c from Customer c where c.memberref_code = :memberref_code "),
    @NamedQuery(name = "Customer.findByUsername", query = "select c from Customer c where c.user.userName = :username")})

public class Customer extends Person implements Serializable{

    
    
    @ManyToMany
    @JoinTable(name = "marketing_tree",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "member_id"))
    
    private List<Members> member = new ArrayList<>();

   
    
    public Customer(String memberref_code, String firstName, String lastName, String email, Date birthDate) {
        super(firstName, lastName, email, birthDate);
        this.memberref_code = memberref_code;
    }

    /**
     *
     */
    
    
    
    public Customer(String firstName, String lastName, String email, Date birthDate) {
        super(firstName, lastName, email, birthDate);
    }

    public Customer() {
        
    }
    
    private String memberref_code;
    
    @OneToOne
    private User user;

    /**
     * Get the value of user
     *
     * @return the value of user
     */
    public User getUser() {
        return user;
    }

    /**
     * Set the value of user
     *
     * @param user new value of user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     *
     * @return
     */
    public String getMemberref_code() {
        return memberref_code;
    }

    /**
     *
     * @param memberref_code
     */
    public void setMemberref_code(String memberref_code) {
        this.memberref_code = memberref_code;
    }

    /**
     *
     * @return
     */
    public List<Members> getMembers() {
        return member;
    }
    
    
}
