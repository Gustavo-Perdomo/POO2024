/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entregaejercicios8.a12;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Main {
    public static void main(String[] args) {
        // Crear aeropuertos
        AeropuertoComercial aeropuerto1 = new AeropuertoComercial("Aeropuerto A", "Ciudad A", 3);
        AeropuertoComercial aeropuerto2 = new AeropuertoComercial("Aeropuerto B", "Ciudad B", 2);
        AeropuertoMilitar aeropuertoMilitar = new AeropuertoMilitar("Aeropuerto Militar", "Ciudad C", "ClaveA");

        // Crear aviones
        AvionPasajeros avionPasajeros = new AvionPasajeros("Avión Pasajeros 1", "ABC123", 1500, 180);
        AvionCarga avionCarga = new AvionCarga("Avión Carga 1", "DEF456", 2000, 5000);
        Avioneta avioneta = new Avioneta("Avioneta 1", "GHI789", 800, 4);

        // Agregar pasajeros
        avionPasajeros.agregarPasajero(new Pasajero("Juan Perez", "12345678A", 30));
        avionPasajeros.agregarPasajero(new Pasajero("Maria Lopez", "87654321B", 25));

        // Agregar aviones a los aeropuertos
        aeropuerto1.agregarAvion(avionPasajeros);
        aeropuerto1.agregarAvion(avionCarga);
        aeropuerto2.agregarAvion(avioneta);

        // Mostrar información de aviones en un aeropuerto
        System.out.println("Información de aviones en " + aeropuerto1.getNombre() + ":");
        aeropuerto1.mostrarInformacionAviones();

        // Buscar un pasajero
        System.out.println("\nBuscando pasajero 'Juan Perez':");
        aeropuerto1.buscarPasajero("Juan Perez");

        System.out.println("\nBuscando pasajero 'Carlos Garcia':");
        aeropuerto1.buscarPasajero("Carlos Garcia");
    }
}
