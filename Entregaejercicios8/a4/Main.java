/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entregaejercicios8.a4;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Coche
        Coche coche1 = new Coche("Toyota", "Rojo", 15000.0, 1.2, 2015);
        coche1.setDniTitular("12345678A");
        coche1.setMatricula("ABC1234");
        
        System.out.println("Coche 1:");
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Color: " + coche1.getColor());
        System.out.println("Precio: " + coche1.getPrecio());
        System.out.println("Año: " + coche1.getAnio());
        System.out.println("KM: " + coche1.getKm());
        System.out.println("DNI Titular: " + coche1.getDniTitular());
        System.out.println("Matrícula: " + coche1.getMatricula());
        
        // Incrementar los kilómetros
        coche1.incrementarKm(500);
        System.out.println("Kilómetros después de incrementar: " + coche1.getKm());

        // Cambiar el color
        coche1.setColor("Azul");
        System.out.println("Nuevo color de coche 1: " + coche1.getColor());
        
        // Crear otro objeto de la clase Coche
        Coche coche2 = new Coche("Honda", "Negro", 18000.0, 1.0, 2018);
        coche2.setDniTitular("87654321B");
        
        // Probar el método comprarCoche
        coche1.comprarCoche(coche2);
        System.out.println("DNI Titular de coche 1 después de comprar coche 2: " + coche1.getDniTitular());

        // Crear un objeto de la clase CocheMatriculado
        CocheMatriculado cocheMatriculado = new CocheMatriculado("Ford", "Blanco", 20000.0, 1.5, 2010, 
                                                                2021, 5, "XYZ5678", "11223344C");
        
        System.out.println("\nCoche Matriculado:");
        System.out.println("Marca: " + cocheMatriculado.getMarca());
        System.out.println("Color: " + cocheMatriculado.getColor());
        System.out.println("Precio: " + cocheMatriculado.getPrecio());
        System.out.println("Año: " + cocheMatriculado.getAnio());
        System.out.println("Año de matriculación: " + cocheMatriculado.getAnioMatriculacion());
        System.out.println("Mes de matriculación: " + cocheMatriculado.getMesMatriculacion());
        System.out.println("Impuesto de matriculación: " + cocheMatriculado.getImpuestoMatriculacion());
        
        // Cambiar el impuesto de matriculación usando el setter
        cocheMatriculado.setImpuestoMatriculacion();
        System.out.println("Impuesto de matriculación después de recalcular: " + cocheMatriculado.getImpuestoMatriculacion());
    }
}
