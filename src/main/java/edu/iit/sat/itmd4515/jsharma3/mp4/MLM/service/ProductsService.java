/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.jsharma3.mp4.MLM.service;


import edu.iit.sat.itmd4515.jsharma3.mp4.MLM.Products;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Jay
 */
@Stateless
public class ProductsService extends AbstractService<Products> {
    
    public ProductsService() {
        super(Products.class);
    }

    @Override
    public List<Products> findAll() {
        return getEntityManager().createNamedQuery("Products.findAll",Products.class).getResultList();
    }

  
}
