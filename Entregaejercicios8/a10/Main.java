/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entregaejercicios8.a10;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Main {
    public static void main(String[] args) {
        // Crear alfombras
        AlfombraRedonda alfombra1 = new AlfombraRedonda("Roja", 20, 5);
        AlfombraCuadrada alfombra2 = new AlfombraCuadrada("Azul", 15, 4);
        
        // Crear habitación
        Habitacion habitacion = new Habitacion("Sala de Estar");
        habitacion.agregarAlfombra(alfombra1);
        habitacion.agregarAlfombra(alfombra2);
        
        // Mostrar precios de las alfombras en la habitación
        System.out.println("Precio total de alfombras en la habitación: " + habitacion.calcularPrecioTotalAlfombras());
        System.out.println("Precio total de alfombras cuadradas en la habitación: " + habitacion.calcularPrecioTotalAlfombrasCuadradas());
        
        // Crear mansión
        Mansion mansion = new Mansion();
        mansion.agregarHabitacion(habitacion);
        
        // Mostrar precios de las alfombras en la mansión
        System.out.println("Precio total de alfombras en la mansión: " + mansion.calcularPrecioTotalAlfombras());
        System.out.println("Precio total de alfombras cuadradas en la mansión: " + mansion.calcularPrecioTotalAlfombrasCuadradas());
    }
}
