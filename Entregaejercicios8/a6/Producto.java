/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a6;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Producto {
    private String fechaCaducidad;
    private int numeroLote;

    public Producto(String fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public void mostrarInfo() {
        System.out.println("Fecha de Caducidad: " + fechaCaducidad);
        System.out.println("Número de Lote: " + numeroLote);
    }
}
