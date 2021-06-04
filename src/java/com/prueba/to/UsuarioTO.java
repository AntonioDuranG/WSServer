/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.to;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author freet
 */
@Entity
@Table(name = "usuariostb")
public class UsuarioTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDUSUARIO")//Esto es como esta en BD
    private int idusuario;//como lo voy a manipular en java
    @Column(name = "APELLIDOPATERNO")
    private String apaterno;
    @Column(name = "APELLIDOMATERNO")
    private String amaterno;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "WEBSERVICES")
    private int webservices;

    public UsuarioTO() {
    }

    public UsuarioTO(String apaterno, String amaterno, String nombre, String email, int webservices) {
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.nombre = nombre;
        this.email = email;
        this.webservices = webservices;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getWebservices() {
        return webservices;
    }

    public void setWebservices(int webservices) {
        this.webservices = webservices;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idusuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioTO)) {
            return false;
        }
        UsuarioTO other = (UsuarioTO) object;
        if (this.idusuario != other.idusuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.to.UsuarioTO[ id=" + idusuario + " ]";
    }

}
