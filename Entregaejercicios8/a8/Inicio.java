/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entregaejercicios8.a8;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Inicio {
    public static void main(String[] args) {
        Math2 math2 = new Math2();

        int[] intArray = {3, 5, 1, 4, 2};
        System.out.println("Mínimo (int): " + math2.min(intArray));
        System.out.println("Máximo (int): " + math2.max(intArray));

        double[] doubleArray = {3.5, 5.2, 1.1, 4.8, 2.3};
        System.out.println("Mínimo (double): " + math2.min(doubleArray));
        System.out.println("Máximo (double): " + math2.max(doubleArray));
    }
}
