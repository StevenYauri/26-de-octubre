import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int contador = 1;
        double sumaNotas = 0;
        
        // Ciclo while para pedir exactamente 5 notas
        while (contador <= 5) {
            System.out.print("Nota " + contador + ": ");
            double nota = teclado.nextDouble();
            
            // Validación: Verifica que la nota sea válida (entre 0 y 20)
            if (nota >= 0 && nota <= 20) {
                sumaNotas = sumaNotas + nota; // Acumula la nota
                contador = contador + 1;      // Avanza a la siguiente nota solo si es válida
            } else {
                System.out.println("Error: La nota debe estar entre 0 y 20. Intente de nuevo.");
            }
        }
        
        // Calcular el promedio dividiendo el total entre 5
        double promedio = sumaNotas / 5;
        
        // Mostrar el resultado por pantalla
        System.out.println("Promedio: " + promedio);
        
        teclado.close();
    }
}
