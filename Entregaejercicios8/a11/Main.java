/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entregaejercicios8.a11;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Main {
    public static void main(String[] args) {
        ProfesorEmerito profesorEmerito = new ProfesorEmerito("Juan Pérez", 65, 20, 5);
        
        System.out.println("Nombre: " + profesorEmerito.getNombre());
        System.out.println("Edad: " + profesorEmerito.getEdad());
        System.out.println("Años Consolidados: " + profesorEmerito.getAñosConsolidados());
        System.out.println("Años como Emérito: " + profesorEmerito.getAñosEmerito());
        System.out.println("Salario Base: " + profesorEmerito.obtenerSalarioBase());
    }
}