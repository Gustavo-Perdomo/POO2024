/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entregaejercicios8.a10;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public abstract class Alfombra implements IAlfombras {
    private String color;
    private int precioMetro;

    public Alfombra(String color, int precioMetro) {
        this.color = color;
        this.precioMetro = precioMetro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecioMetro() {
        return precioMetro;
    }

    public void setPrecioMetro(int precioMetro) {
        this.precioMetro = precioMetro;
    }

    @Override
    public abstract double calcularSuperficie();

    @Override
    public double calcularPrecio() {
        return calcularSuperficie() * precioMetro;
    }
}
