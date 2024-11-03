/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entregaejercicios8.a10;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Habitacion {
    private String nombre;
    private Alfombra[] alfombras;
    private int contadorAlfombras;

    public Habitacion(String nombre) {
        this.nombre = nombre;
        this.alfombras = new Alfombra[10]; 
        this.contadorAlfombras = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean agregarAlfombra(Alfombra alf) {
        if (contadorAlfombras < alfombras.length) {
            alfombras[contadorAlfombras] = alf;
            contadorAlfombras++;
            return true;
        }
        return false; 
    }

    public double calcularPrecioTotalAlfombras() {
        double total = 0;
        for (int i = 0; i < contadorAlfombras; i++) {
            total += alfombras[i].calcularPrecio();
        }
        return total;
    }

    public double calcularPrecioTotalAlfombrasCuadradas() {
        double totalCuadradas = 0;
        for (int i = 0; i < contadorAlfombras; i++) {
            if (alfombras[i] instanceof AlfombraCuadrada) {
                totalCuadradas += alfombras[i].calcularPrecio();
            }
        }
        return totalCuadradas;
    }
}