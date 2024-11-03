/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a6;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class CongeladoPorAgua extends ProductoCongelado {
    private double salinidadAgua;

    public CongeladoPorAgua(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada, double salinidadAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.salinidadAgua = salinidadAgua;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Salinidad del Agua: " + salinidadAgua + " g/L");
    }
}
