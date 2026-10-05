package Matriz;
import java.util.Scanner;

public class EjercicioMatriz4 {
    public static void main(String[] args){

        int sueldo[] = new int [12];
        int suma = 0;
        int promedio = 0;

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < sueldo.length; i++){
            System.out.println("Sueldo (" + i + "): ");
            sueldo[i] = teclado.nextInt();

            suma += sueldo[i];
            promedio = suma / 12;
        }

        System.out.println("Suma sueldos: $" + suma + " USD");
        System.out.println("Promedio sueldos: $" + promedio + " USD");

    }
}