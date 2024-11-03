/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a5;
/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(double precioCompra, String marca, double precioVenta, int numPuertas) {
        super(precioCompra, marca, precioVenta);
        this.numPuertas = numPuertas;
    }

    @Override
    public double precioVenta() {
        return precioVenta * 1.1;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Puertas: " + numPuertas;
    }
}
