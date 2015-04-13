/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.jsharma3.mp4.MLM.service;

import edu.iit.sat.itmd4515.jsharma3.mp4.MLM.Members;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Jay
 */
@Stateless
public class MemberService extends AbstractService<Members>{
    
    public MemberService() {
        super(Members.class);
    }

    @Override
    public List<Members> findAll() {
        return getEntityManager().createNamedQuery("Members.findAll",Members.class).getResultList();
    }

    public Members findByUsername(String username) {
        return getEntityManager().createNamedQuery("Members.findByUsername",Members.class).setParameter("username", username).getSingleResult();
    }
}
