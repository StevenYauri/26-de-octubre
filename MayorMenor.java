import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese 10 números:");
        
        // 1. Leer el primer número para inicializar el mayor y el menor
        System.out.print("Número 1: ");
        int numero = teclado.nextInt();
        
        int mayor = numero;
        int menor = numero;
        
        // El contador empieza en 2 porque ya leímos el primer número
        int contador = 2; 
        
        // 2. Ciclo while para leer los 9 números restantes
        while (contador <= 10) {
            System.out.print("Número " + contador + ": ");
            numero = teclado.nextInt();
            
            // Evaluar si el número ingresado es el nuevo mayor
            if (numero > mayor) {
                mayor = numero;
            }
            
            // Evaluar si el número ingresado es el nuevo menor
            if (numero < menor) {
                menor = numero;
            }
            
            contador = contador + 1; // Avanzar al siguiente número
        }
        
        // 3. Mostrar los resultados por pantalla
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        
        teclado.close();
    }
}
