import java.util.Scanner; // Clase utilizada para obtener la entrada de datos proporcionada por el usuario.
import java.util.InputMismatchException; // Clase utilizada para capturar excepciones en caso de que el tipo de entrada sea incorrecto.

public class Vehiculo {
    public static void main(String[] args) {
        // Se instancia un objeto de tipo Scanner para gestionar la captura de la entrada de datos del usuario.
        Scanner scanner = new Scanner(System.in);

        // Se solicita al usuario que proporcione la marca del vehículo, la cual es almacenada en la variable "marca".
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();

        // Se solicita al usuario que proporcione el modelo del vehículo, almacenándose en la variable "modelo".
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();

        // Se solicita la cilindrada del vehículo, siendo almacenada en la variable "cilindrada".
        System.out.print("Ingrese la cilindrada del vehículo: ");
        String cilindrada = scanner.nextLine();

        // Se solicita el tipo de combustible, siendo almacenado en la variable "combustible".
        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = scanner.nextLine();

        // Inicialización de la variable capacidadPasajeros y del indicador de validez para gestionar la entrada de datos del usuario.
        int capacidadPasajeros = 0;
        boolean entradaValida = false;

        // Bucle que repite el proceso hasta que se obtiene una entrada válida para la capacidad de pasajeros.
        while (!entradaValida) {
            System.out.print("Ingrese la capacidad de pasajeros: ");
            try {
                capacidadPasajeros = scanner.nextInt(); // Se intenta capturar un valor entero que represente la capacidad de pasajeros.
                entradaValida = true; // Se confirma la validez de la entrada si esta es un número entero.
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido."); // Mensaje mostrado en caso de error por entrada no numérica.
                scanner.next(); // Se descarta la entrada incorrecta y se solicita una nueva.
            }
        }

        // Se imprimen los datos ingresados por el usuario.
        System.out.println("\nLa marca ingresada es: " + marca);
        System.out.println("El modelo ingresado es: " + modelo);
        System.out.println("La cilindrada ingresada es: " + cilindrada);
        System.out.println("El tipo de combustible ingresado es: " + combustible);
        System.out.println("La capacidad de pasajeros ingresada es: " + capacidadPasajeros);

        // Se cierra el objeto Scanner para liberar los recursos asociados.
        scanner.close();
    }
}
