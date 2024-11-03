/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a7;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[4];

        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el teléfono del empleado " + (i + 1) + ": ");
            String telefono = scanner.nextLine();

            empleados[i] = new Empleado(nombre, telefono);
        }

        System.out.println("\nDatos de los empleados:");
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Teléfono: " + empleado.getTelefono());
            System.out.println();
        }

        System.out.println("Número total de empleados instanciados: " + Empleado.getNumeroEmpleados());
    }
}
