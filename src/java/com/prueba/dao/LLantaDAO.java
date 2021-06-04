/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dao;

import com.prueba.to.LLantaTO;
import javax.ejb.Stateless;

/**
 *
 * @author freet
 */
@Stateless(name = "controladorLlanta")
public class LLantaDAO extends AbstractFacade<LLantaTO> implements ProcesoDAO<LLantaTO> {

    public LLantaDAO() {
        super(LLantaTO.class);
    }

    @Override
    public LLantaTO find(String valora, String valorb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
