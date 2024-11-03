/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a9;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public abstract class Vivienda {
    private String calle;
    private double precio;
    private int superficieEnMetros;

    public Vivienda(String calle, int superficieEnMetros) {
        this.calle = calle;
        this.superficieEnMetros = superficieEnMetros;
        this.precio = calcularPrecio();
    }

    public abstract double impuestoMunicipal();

    public double calcularPrecio() {
        return superficieEnMetros * 1000; 
    }

    public void aumentarPrecio(int aumento) {
        this.precio += aumento;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCalle() {
        return calle;
    }

    public int getSuperficieEnMetros() {
        return superficieEnMetros;
    }
}