//Pide un nombre y una edad. Luego nos dice por consola: "El señor/a XXXXX hace YYYY años que es mayor de edad".
package repositorio;
import java.util.Scanner;
public class taller4 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Hola,como te llamas: ");
        String nombre;
        nombre=input.nextLine();
        System.out.println ("Me alegra conocerte "+nombre);
        System.out.println("Ahora, cuentame cuantos años  tienes: ");
        int edad=input.nextInt();
        if (edad >= 18) {
            int añosMayorDeEdad = edad - 18;
            System.out.println( nombre + " ,hace " + añosMayorDeEdad + " años eres mayor de edad.");
        } else {
            System.out.println( nombre + " ,aún no eres mayor de edad.");
        }
    }
}
    

