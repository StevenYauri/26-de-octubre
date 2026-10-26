import java.util.Scanner;

public class EjercicioSuma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;

        // Validación: Repite la solicitud mientras el número no sea positivo
        while (n <= 0) {
            System.out.print("Ingrese N (debe ser un entero positivo): ");
            n = teclado.nextInt();
            
            if (n <= 0) {
                System.out.println("Error: El número debe ser mayor que 0. Intente nuevamente.");
            }
        }

        // Variables para el cálculo de la suma
        int suma = 0;
        int contador = 1;

        // Ciclo while para realizar la suma acumulada
        while (contador <= n) {
            suma = suma + contador;
            contador = contador + 1;
        }

        // Mostrar el resultado por pantalla
        System.out.println("Resultado: " + suma);

        teclado.close();
    }
}
