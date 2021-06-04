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
@Table(name = "llantastb")
public class LLantaTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDLLANTA")
    private int idllanta;
    @Column(name = "TAG")
    private String tag;

    public LLantaTO() {
    }

    public LLantaTO(String tag) {
        this.tag = tag;
    }

    public int getIdllanta() {
        return idllanta;
    }

    public void setIdllanta(int idllanta) {
        this.idllanta = idllanta;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idllanta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LLantaTO)) {
            return false;
        }
        LLantaTO other = (LLantaTO) object;
        if (this.idllanta != other.idllanta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prueba.to.LLantaTO[ id=" + idllanta + " ]";
    }

}
