/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a9;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Adosado extends Vivienda {
    private int numPlantas;

    public Adosado(String calle, int superficieEnMetros, int numPlantas) {
        super(calle, superficieEnMetros);
        this.numPlantas = numPlantas;
    }

    @Override
    public double impuestoMunicipal() {
        return getPrecio() * 0.05;
    }
}
