/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a5;
/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche(10000, "Toyota", 15000, 4);
        Furgoneta furgoneta = new Furgoneta(20000, "Ford", 25000, 1500);
        Camion camion = new Camion(30000, "Volvo", 40000, 10, 3);

        System.out.println("Coche: " + coche);
        System.out.println("Precio de Venta: " + coche.precioVenta());

        System.out.println("Furgoneta: " + furgoneta);
        System.out.println("Precio de Venta: " + furgoneta.precioVenta());

        System.out.println("Camion: " + camion);
        System.out.println("Precio de Venta: " + camion.precioVenta());
    }
}
