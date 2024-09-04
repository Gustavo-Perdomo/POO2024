//Escribir un programa que escriba por pantalla dos números al azar entre 10 y 20
package repositorio;
    import java.util.Random;
    class taller3 {
public static void main(String[] args) {
        Random random = new Random();
        int numero1 = 10 + random.nextInt(10);
        int numero2 = 10 + random.nextInt(10);
        System.out.println("numero al azar" + numero1);
        System.out.println("numero al azar" + numero2);
 }
                
             }