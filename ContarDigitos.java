import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        // 1. Validación: El número debe tener tres o más cifras (mínimo 100)
        while (numero < 100) {
            System.out.print("Ingrese un número (de 3 o más cifras): ");
            numero = teclado.nextInt();
            
            if (numero < 100) {
                System.out.println("Error: El número debe tener al menos 3 dígitos. Intente nuevamente.");
            }
        }

        // Guardamos una copia del número para no perder el valor original al dividir
        int copiaNumero = numero;
        int cantidadDigitos = 0;

        // 2. Ciclo while con divisiones sucesivas entre 10
        while (copiaNumero > 0) {
            copiaNumero = copiaNumero / 10; // Quita el último dígito del número
            cantidadDigitos = cantidadDigitos + 1; // Cuenta el dígito eliminado
        }

        // 3. Mostrar el resultado por pantalla
        System.out.println("Cantidad de dígitos: " + cantidadDigitos);

        teclado.close();
    }
}
