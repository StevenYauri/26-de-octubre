import java.util.Scanner;

public class ContarPares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;

        // 1. Validación: Repite la solicitud si el número no es positivo
        while (n <= 0) {
            System.out.print("Ingrese N (entero positivo): ");
            n = teclado.nextInt();
            
            if (n <= 0) {
                System.out.println("Error: El número debe ser mayor que 0. Intente nuevamente.");
            }
        }

        // 2. Inicializar variables de control y conteo
        int contador = 1;
        int cantidadPares = 0;

        // 3. Ciclo while para evaluar cada número desde 1 hasta N
        while (contador <= n) {
            // Si el residuo de dividir entre 2 es 0, significa que el número es par
            if (contador % 2 == 0) {
                cantidadPares = cantidadPares + 1; // Incrementa el contador de pares
            }
            contador = contador + 1; // Avanza al siguiente número
        }

        // 4. Mostrar el resultado por pantalla
        System.out.println("Cantidad de pares: " + cantidadPares);

        teclado.close();
    }
}
