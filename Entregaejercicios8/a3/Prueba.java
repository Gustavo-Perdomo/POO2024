/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entregaejercicios8.a3;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class Prueba {
    public static void main(String[] args) {

        Persona cliente1 = new Persona("Juan Perez", "12345678A");


        CuentaCorriente cuentaCorriente = new CuentaCorriente(cliente1, 1234567890L, 500.0);
        cuentaCorriente.ingresar(1000.0);
        System.out.println(cuentaCorriente);
        
 
        cuentaCorriente.retirar(200.0);
        System.out.println("Después de retirar 200: " + cuentaCorriente);

 
        cuentaCorriente.retirar(600.0);
        System.out.println("Después de intentar retirar 600: " + cuentaCorriente);


        CuentaAhorro cuentaAhorro = new CuentaAhorro(cliente1, 9876543210L, 300.0);
        cuentaAhorro.ingresar(1000.0);
        System.out.println(cuentaAhorro);

   
        cuentaAhorro.retirar(500.0);
        System.out.println("Después de retirar 500: " + cuentaAhorro);

  
        cuentaAhorro.retirar(300.0);
        System.out.println("Después de intentar retirar 300: " + cuentaAhorro);
    }
}

