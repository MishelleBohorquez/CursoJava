package Matriz;
import java.util.Scanner;

public class EjercicioMatriz4 {
    public static void main(String[] args){
/*
        //Ejercicio 4
        double sueldo[] = new double [12];
        double suma = 0;
        double promedio = 0;

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < sueldo.length; i++){
            System.out.println("Sueldo (" + i + "): ");
            sueldo[i] = teclado.nextDouble();

            suma += sueldo[i];
            promedio = suma / sueldo.length;
        }

        System.out.println("Suma sueldos: $" + suma + " USD");
        System.out.println("Promedio sueldos: $" + promedio + " USD");
 */
        //Forma Modular
        double sueldo[] = new double [12];
        double suma = 0;
        double promedio = 0;

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < sueldo.length; i++){
            System.out.println("Sueldo mes " + (i+1) + ": ");
            sueldo[i] = teclado.nextDouble();
        }

        for(int i = 0; i < sueldo.length; i++){
            suma += sueldo[i];
        }

        for(int i = 0; i < sueldo.length; i++){
            promedio = suma / sueldo.length;
        }

        System.out.println("Suma sueldos: $" + suma + " USD");
        System.out.println("Promedio sueldos: $" + promedio + " USD");

    }
}