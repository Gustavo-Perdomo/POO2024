/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entregaejercicios8.a12;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class AeropuertoMilitar extends Aeropuerto {
    private String nombreEnClave;

    public AeropuertoMilitar(String nombre, String ciudad, String nombreEnClave) {
        super(nombre, ciudad);
        this.nombreEnClave = nombreEnClave;
    }

    public String getNombreEnClave() {
        return nombreEnClave;
    }
}
