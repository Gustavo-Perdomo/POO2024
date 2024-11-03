/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a9;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Main {
    public static void main(String[] args) {
        Urbanizacion urbanizacion = new Urbanizacion();

        Piso piso1 = new Piso("Calle Falsa 123", 80, 2, 5);
        Adosado adosado1 = new Adosado("Calle Real 456", 120, 2);
        Chalet chalet1 = new Chalet("Calle Verde 789", 150, 1, true);
        
        urbanizacion.agregarVivienda(piso1);
        urbanizacion.agregarVivienda(adosado1);
        urbanizacion.agregarVivienda(chalet1);

        System.out.println("Precio total de la urbanización: " + urbanizacion.calcularPrecioTotal());
        System.out.println("Precio total de los chalets: " + urbanizacion.calcularPrecioChalets());
    }
}
