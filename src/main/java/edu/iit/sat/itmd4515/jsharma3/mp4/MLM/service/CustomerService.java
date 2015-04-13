/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.jsharma3.mp4.MLM.service;

import edu.iit.sat.itmd4515.jsharma3.mp4.MLM.Customer;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Jay
 */
@Stateless
public class CustomerService extends AbstractService<Customer> {

    public CustomerService() {
        super(Customer.class);
    }

    
    @Override
    public List<Customer> findAll() {
        return getEntityManager().createNamedQuery("Customer.findAll",Customer.class).getResultList();
    }

    public Customer findByUsername(String username) {
        return getEntityManager().createNamedQuery("Customer.findByUsername",Customer.class).setParameter("username", username).getSingleResult();
    }
    
}
