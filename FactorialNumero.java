import java.util.Scanner;

public class FactorialNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = -1;

        // 1. Validación: El número no puede ser negativo
        while (numero < 0) {
            System.out.print("Ingrese un número (entero positivo o cero): ");
            numero = teclado.nextInt();
            
            if (numero < 0) {
                System.out.println("Error: El número no puede ser negativo. Intente nuevamente.");
            }
        }

        // 2. Inicializar variables para el cálculo
        // El factorial empieza en 1 porque si empieza en 0, toda multiplicación daría 0
        long factorial = 1; 
        int contador = 1;

        // 3. Ciclo while para multiplicar correlativamente desde 1 hasta el número
        while (contador <= numero) {
            factorial = factorial * contador;
            contador = contador + 1;
        }

        // 4. Mostrar el resultado por pantalla
        System.out.println("Factorial = " + factorial);

        teclado.close();
    }
}
