/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a6;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Main {
    public static void main(String[] args) {
        ProductoFresco fresco1 = new ProductoFresco("2024-12-01", 101, "2024-10-01", "España");
        ProductoFresco fresco2 = new ProductoFresco("2025-01-15", 102, "2024-11-05", "México");

        ProductoRefrigerado refri1 = new ProductoRefrigerado("2024-12-15", 201, "ORG123", "2024-11-01", 4.0, "Francia");
        ProductoRefrigerado refri2 = new ProductoRefrigerado("2024-11-30", 202, "ORG456", "2024-10-20", 5.0, "Italia");
        ProductoRefrigerado refri3 = new ProductoRefrigerado("2025-02-20", 203, "ORG789", "2024-12-01", 3.5, "Alemania");

        CongeladoPorAire aire1 = new CongeladoPorAire("2025-03-01", 301, "2024-11-10", "Argentina", -18.0, 78.0, 21.0, 0.03, 0.97);
        CongeladoPorAire aire2 = new CongeladoPorAire("2025-04-01", 302, "2024-12-01", "Brasil", -20.0, 75.0, 20.0, 0.04, 0.96);

        CongeladoPorAgua agua1 = new CongeladoPorAgua("2025-05-15", 303, "2024-10-05", "Chile", -18.0, 3.5);
        CongeladoPorAgua agua2 = new CongeladoPorAgua("2025-06-01", 304, "2024-11-15", "Uruguay", -19.0, 3.0);

        CongeladoPorNitrogeno nitrogeno1 = new CongeladoPorNitrogeno("2025-07-01", 305, "2024-12-25", "Perú", -22.0, "Inmersión Rápida", 120);

        System.out.println("Productos Frescos:");
        fresco1.mostrarInfo();
        System.out.println();
        fresco2.mostrarInfo();
        System.out.println();

        System.out.println("Productos Refrigerados:");
        refri1.mostrarInfo();
        System.out.println();
        refri2.mostrarInfo();
        System.out.println();
        refri3.mostrarInfo();
        System.out.println();

        System.out.println("Productos Congelados por Aire:");
        aire1.mostrarInfo();
        System.out.println();
        aire2.mostrarInfo();
        System.out.println();

        System.out.println("Productos Congelados por Agua:");
        agua1.mostrarInfo();
        System.out.println();
        agua2.mostrarInfo();
        System.out.println();

        System.out.println("Producto Congelado por Nitrógeno:");
        nitrogeno1.mostrarInfo();
    }
}