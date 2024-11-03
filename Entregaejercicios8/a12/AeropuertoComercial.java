/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entregaejercicios8.a12;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class AeropuertoComercial extends Aeropuerto {
    private int numeroTerminales;

    public AeropuertoComercial(String nombre, String ciudad, int numeroTerminales) {
        super(nombre, ciudad);
        this.numeroTerminales = numeroTerminales;
    }

    public int getNumeroTerminales() {
        return numeroTerminales;
    }
}
