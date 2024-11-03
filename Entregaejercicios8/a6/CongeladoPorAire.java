/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a6;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class CongeladoPorAire extends ProductoCongelado {
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeCO2;
    private double porcentajeVaporAgua;

    public CongeladoPorAire(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada, double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeCO2, double porcentajeVaporAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeCO2 = porcentajeCO2;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Composición del Aire: ");
        System.out.println("  Nitrógeno: " + porcentajeNitrogeno + "%");
        System.out.println("  Oxígeno: " + porcentajeOxigeno + "%");
        System.out.println("  CO2: " + porcentajeCO2 + "%");
        System.out.println("  Vapor de Agua: " + porcentajeVaporAgua + "%");
    }
}
