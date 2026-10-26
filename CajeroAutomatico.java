import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Saldo inicial
        double saldo = 1000.0;
        double retiro = -1; // Inicializado en -1 para entrar al ciclo while

        System.out.println("--- BIENVENIDO AL CAJERO AUTOMÁTICO ---");
        
        // El ciclo se repite mientras el retiro no sea 0 y todavía quede dinero en la cuenta
        while (retiro != 0 && saldo > 0) {
            System.out.println("\nSaldo actual: S/ " + saldo);
            System.out.print("Ingrese el monto a retirar (o presione 0 para salir): S/ ");
            retiro = teclado.nextDouble();
            
            // Caso 1: El usuario decide salir del programa
            if (retiro == 0) {
                System.out.println("Gracias por utilizar nuestros servicios.");
            } 
            // Caso 2: Intento de retiro inválido (número negativo)
            else if (retiro < 0) {
                System.out.println("Error: No puede ingresar montos negativos.");
            } 
            // Caso 3: El retiro supera el saldo disponible
            else if (retiro > saldo) {
                System.out.println("Error: Saldo insuficiente. Intente con un monto menor.");
            } 
            // Caso 4: Retiro exitoso y permitido
            else {
                saldo = saldo - retiro; // Actualiza disminuyendo el saldo
                System.out.println("Retiro exitoso. Saldo restante: S/ " + saldo);
            }
        }
        
        // Mensaje final si se quedó sin dinero en la cuenta
        if (saldo == 0) {
            System.out.println("\nSu cuenta se ha quedado sin fondos. El programa ha finalizado.");
        }
        
        teclado.close();
    }
}
