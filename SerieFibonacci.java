import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int terminos = 0;

        // 1. Validación: Debe pedir al menos 1 término
        while (terminos <= 0) {
            System.out.print("Ingrese cantidad de términos: ");
            terminos = teclado.nextInt();
            
            if (terminos <= 0) {
                System.out.println("Error: La cantidad debe ser mayor que 0. Intente nuevamente.");
            }
        }

        // 2. Inicializar los dos primeros valores de la serie Fibonacci
        int a = 0;
        int b = 1;
        
        int contador = 1;

        // 3. Ciclo while para generar los términos solicitados
        while (contador <= terminos) {
            // Muestra el término actual seguido de un espacio
            System.out.print(a + " ");
            
            // Calcula el siguiente valor sumando los dos anteriores
            int siguiente = a + b;
            
            // Desplaza los valores hacia adelante para la siguiente vuelta
            a = b;
            b = siguiente;
            
            contador = contador + 1; // Incrementa el contador del ciclo
        }
        
        System.out.println(); // Salto de línea estético al finalizar
        teclado.close();
    }
}
