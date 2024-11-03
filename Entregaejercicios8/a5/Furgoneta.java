/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a5;
/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Furgoneta extends Vehiculo {
    private double capacidadCarga;

    public Furgoneta(double precioCompra, String marca, double precioVenta, double capacidadCarga) {
        super(precioCompra, marca, precioVenta);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double precioVenta() {
        return precioVenta * 1.15;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad de Carga: " + capacidadCarga + " kg";
    }
}
