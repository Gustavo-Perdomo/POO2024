/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a6;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class ProductoRefrigerado extends Producto {
    private String codigoOrganismo;
    private String fechaEnvasado;
    private double temperaturaRecomendada;
    private String paisOrigen;

    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String codigoOrganismo, String fechaEnvasado, double temperaturaRecomendada, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Código Organismo: " + codigoOrganismo);
        System.out.println("Fecha de Envasado: " + fechaEnvasado);
        System.out.println("Temperatura Recomendada: " + temperaturaRecomendada + " °C");
        System.out.println("País de Origen: " + paisOrigen);
    }
}
