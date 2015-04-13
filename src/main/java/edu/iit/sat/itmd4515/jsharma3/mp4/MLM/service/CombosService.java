/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.jsharma3.mp4.MLM.service;

import edu.iit.sat.itmd4515.jsharma3.mp4.MLM.Combos;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Jay
 */
@Stateless
public class CombosService extends AbstractService<Combos> {
    
    public CombosService() {
        super(Combos.class);
    }

    @Override
    public List<Combos> findAll() {
        return getEntityManager().createNamedQuery("Combos.findAll",Combos.class).getResultList();
    }

   
}
