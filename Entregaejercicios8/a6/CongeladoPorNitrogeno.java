/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a6;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class CongeladoPorNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private int tiempoExposicion;

    public CongeladoPorNitrogeno(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada, String metodoCongelacion, int tiempoExposicion) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Método de Congelación: " + metodoCongelacion);
        System.out.println("Tiempo de Exposición: " + tiempoExposicion + " segundos");
    }
}
