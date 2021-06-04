/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dao;

import com.prueba.to.UsuarioTO;
import javax.ejb.Stateless;

/**
 *
 * @author freet
 */
@Stateless(name = "controladorUsuario")
public class UsuarioDAO extends AbstractFacade<UsuarioTO> implements ProcesoDAO<UsuarioTO> {

    public UsuarioDAO() {
        super(UsuarioTO.class);
    }

    @Override
    public UsuarioTO find(String valora, String valorb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
