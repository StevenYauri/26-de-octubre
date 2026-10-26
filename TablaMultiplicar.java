import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // 1. Solicitar el número al usuario
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();
        
        // 2. Inicializar el contador en 1 (para empezar desde número x 1)
        int contador = 1;
        
        // 3. Ciclo while para generar la tabla del 1 al 12
        while (contador <= 12) {
            int resultado = numero * contador;
            
            // Muestra la línea actual (Ejemplo: 8 x 1 = 8)
            System.out.println(numero + " x " + contador + " = " + resultado);
            
            // Incrementar el contador para pasar a la siguiente multiplicación
            contador = contador + 1;
        }
        
        teclado.close();
    }
}
