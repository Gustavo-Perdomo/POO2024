//Escribir un programa que escriba por pantalla un numero al azar entre 0 y 99.
//Gustavo Perdomo 
package repositorio;
import java.util.Random;

// Clase que se encarga de generar números al azar
class GeneradorNumeroAzar {

    public int generarNumero() {
        Random random = new Random();
        return random.nextInt(100); // Genera un número entre 0 y 99
    }
}

// Clase principal que ejecuta el programa
public class taller2 {

    public static void main(String[] args) {
        // Crear una instancia del generador
        GeneradorNumeroAzar generador = new GeneradorNumeroAzar();

        // Generar el número y mostrarlo
        int numero = generador.generarNumero();
        System.out.println("Número al azar: " + numero);
    }
}

