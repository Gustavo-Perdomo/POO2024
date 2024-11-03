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

public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private ArrayList<Avion> aviones;

    public Aeropuerto(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.aviones = new ArrayList<>();
    }

    public void agregarAvion(Avion avion) {
        aviones.add(avion);
    }

    public void mostrarInformacionAviones() {
        for (Avion avion : aviones) {
            System.out.println(avion.obtenerInformacion());
        }
    }

    public Pasajero buscarPasajero(String nombrePasajero) {
        for (Avion avion : aviones) {
            for (Pasajero pasajero : avion.getPasajeros()) {
                if (pasajero.getNombre().equalsIgnoreCase(nombrePasajero)) {
                    System.out.println("Pasajero encontrado en el avión: " + avion.obtenerInformacion());
                    System.out.println("Aeropuerto: " + this.getNombre() + ", Ciudad: " + this.getCiudad());
                    return pasajero;
                }
            }
        }
        System.out.println("Pasajero no encontrado.");
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
}
