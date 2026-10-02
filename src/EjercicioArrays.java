import java.util.Scanner;

public class EjercicioArrays {
    public static void main (String[] args){

        // [filas] | [filas] [Columas]
        int numeros [] = new int [5];

        Scanner teclado = new Scanner(System.in);

        // Recorrido && Carga de datos
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Valor (Indice " + i + "): ");
            numeros[i] = teclado.nextInt();
        }

        // Recorrido && Muestra de datos
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Indice: " + i + " | Valor: " + numeros[i]);
        }

        //YA SE EL TAMAÑO
        int numerosModernos[] = {1, 2, 3, 4, 5};
        System.out.println(numerosModernos[2]);

    }
}
