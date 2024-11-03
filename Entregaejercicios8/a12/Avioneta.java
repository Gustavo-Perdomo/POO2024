/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entregaejercicios8.a12;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Avioneta extends Avion {
    private int numeroPasajeros;

    public Avioneta(String nombre, String matricula, int autonomiaVuelo, int numeroPasajeros) {
        super(nombre, matricula, autonomiaVuelo);
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + ", Número de Pasajeros: " + numeroPasajeros;
    }
}