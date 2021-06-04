/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.to;

/**
 *
 * @author freet
 */
public class TrianguloTO {

    private double area;
    private double perimetro;

    public TrianguloTO() {
    }

    public TrianguloTO(int base, int altura, int lado) {
        this.area = (base * altura) / 2;
        this.perimetro = (lado * 2) + base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

}
