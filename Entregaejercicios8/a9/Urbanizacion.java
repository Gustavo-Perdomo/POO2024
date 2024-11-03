/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a9;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
import java.util.ArrayList;
import java.util.List;

public class Urbanizacion {
    private List<Vivienda> viviendas;

    public Urbanizacion() {
        viviendas = new ArrayList<>();
    }

    public void agregarVivienda(Vivienda vivienda) {
        viviendas.add(vivienda);
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Vivienda vivienda : viviendas) {
            total += vivienda.getPrecio();
        }
        return total;
    }

    public double calcularPrecioChalets() {
        double totalChalets = 0;
        for (Vivienda vivienda : viviendas) {
            if (vivienda instanceof Chalet) {
                totalChalets += vivienda.getPrecio();
            }
        }
        return totalChalets;
    }
}