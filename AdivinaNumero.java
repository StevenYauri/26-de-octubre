import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // 1. Definir el número secreto y variables de control
        int numeroSecreto = 50; 
        int intentoUsuario = -1; // Inicializado en un valor diferente al secreto
        int cantidadIntentos = 0;
        
        System.out.println("--- JUEGO: ADIVINA EL NÚMERO ---");
        System.out.println("He pensado en un número. ¡Intenta adivinarlo!");
        
        // 2. Ciclo while: se repite mientras el usuario no acierte el número
        while (intentoUsuario != numeroSecreto) {
            System.out.print("Ingrese un número: ");
            intentoUsuario = teclado.nextInt();
            
            cantidadIntentos = cantidadIntentos + 1; // Sumamos un intento
            
            // Condición 1: El número ingresado es menor que el secreto
            if (intentoUsuario < numeroSecreto) {
                System.out.println("El número es mayor");
            } 
            // Condición 2: El número ingresado es mayor que el secreto
            else if (intentoUsuario > numeroSecreto) {
                System.out.println("El número es menor");
            } 
            // Condición 3: El usuario acertó
            else {
                System.out.println("¡Correcto!");
                System.out.println("Intentos realizados: " + cantidadIntentos);
            }
        }
        
        teclado.close();
    }
}
