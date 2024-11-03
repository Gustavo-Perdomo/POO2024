/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a6;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public abstract class ProductoCongelado extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;
    private double temperaturaRecomendada;

    public ProductoCongelado(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fecha de Envasado: " + fechaEnvasado);
        System.out.println("País de Origen: " + paisOrigen);
        System.out.println("Temperatura Recomendada: " + temperaturaRecomendada + " °C");
    }
}