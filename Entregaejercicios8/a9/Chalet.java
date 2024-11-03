/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a9;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Chalet extends Vivienda {
    private int numParcela;
    private boolean conPiscina;

    public Chalet(String calle, int superficieEnMetros, int numParcela, boolean conPiscina) {
        super(calle, superficieEnMetros);
        this.numParcela = numParcela;
        this.conPiscina = conPiscina;
    }

    @Override
    public double calcularPrecio() {
        return getSuperficieEnMetros() * 1300; 
    }

    @Override
    public double impuestoMunicipal() {
        double impuesto = getPrecio() * 0.05;
        if (conPiscina) {
            impuesto += 200; 
        }
        return impuesto;
    }
}
