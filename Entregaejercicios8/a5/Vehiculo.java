/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a5;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public abstract class Vehiculo {
    protected double precioCompra;
    protected String marca;
    protected double precioVenta;

    public Vehiculo(double precioCompra, String marca, double precioVenta) {
        this.precioCompra = precioCompra;
        this.marca = marca;
        this.precioVenta = precioVenta;
    }
    
    public abstract double precioVenta();

    @Override
    public String toString() {
        return "Marca: " + marca + ", Precio Compra: " + precioCompra + ", Precio Venta: " + precioVenta;
    }
}
