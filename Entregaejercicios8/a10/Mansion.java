/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entregaejercicios8.a10;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Mansion {
    private Habitacion[] arrayHabitaciones;
    private int contadorHabitaciones;

    public Mansion() {
        this.arrayHabitaciones = new Habitacion[5]; // Tamaño del array fijo por simplicidad
        this.contadorHabitaciones = 0;
    }

    public boolean agregarHabitacion(Habitacion hab) {
        if (contadorHabitaciones < arrayHabitaciones.length) {
            arrayHabitaciones[contadorHabitaciones] = hab;
            contadorHabitaciones++;
            return true;
        }
        return false; // No se puede agregar más habitaciones
    }

    public double calcularPrecioTotalAlfombras() {
        double total = 0;
        for (int i = 0; i < contadorHabitaciones; i++) {
            total += arrayHabitaciones[i].calcularPrecioTotalAlfombras();
        }
        return total;
    }

    public double calcularPrecioTotalAlfombrasCuadradas() {
        double totalCuadradas = 0;
        for (int i = 0; i < contadorHabitaciones; i++) {
            totalCuadradas += arrayHabitaciones[i].calcularPrecioTotalAlfombrasCuadradas();
        }
        return totalCuadradas;
    }
}
