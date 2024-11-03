/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entregaejercicios8.a12;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
import java.util.ArrayList;

public abstract class Avion {
    protected String nombre;
    protected String matricula;
    protected int autonomiaVuelo;
    protected ArrayList<Pasajero> pasajeros;

    public Avion(String nombre, String matricula, int autonomiaVuelo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.autonomiaVuelo = autonomiaVuelo;
        this.pasajeros = new ArrayList<>();
    }

    public void agregarPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }

    public String obtenerInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("Nombre: ").append(nombre)
            .append(", Matricula: ").append(matricula)
            .append(", Autonomía: ").append(autonomiaVuelo)
            .append(" km");
        return info.toString();
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }
}
