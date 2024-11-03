/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a5;
/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Camion extends Vehiculo {
    private double tamanoRemolque;
    private int numEjes;

    public Camion(double precioCompra, String marca, double precioVenta, double tamanoRemolque, int numEjes) {
        super(precioCompra, marca, precioVenta);
        this.tamanoRemolque = tamanoRemolque;
        this.numEjes = numEjes;
    }

    @Override
    public double precioVenta() {
        return precioVenta * 1.2;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tamaño del Remolque: " + tamanoRemolque + " m, Número de Ejes: " + numEjes;
    }
}
