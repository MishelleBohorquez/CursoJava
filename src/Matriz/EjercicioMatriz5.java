package Matriz;

import java.util.Scanner;

public class EjercicioMatriz5 {
    public static void main(String[] args) {

        double notas[][] = new double[4][3];
        double promedios[] = new double [4];
        double total;
//      double promedio;


        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumo " + (i + 1) + ": ");
            for (int j = 0; j < notas[0].length; j++) {
                System.out.println("Nota " + (j + 1) + ": ");
                notas[i][j] = teclado.nextDouble();
            }
        }

        for (int i = 0; i < notas.length; i++) {
            total = 0;
            for (int j = 0; j < notas[0].length; j++) {
                total = total + notas[i][j];
            }
            /*
            promedio = total / notas[0].length;
            promedios[i] = promedio;
             */
            promedios[i] = total / notas[0].length;
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("\nAlumo " + (i + 1) + ": ");
            for (int j = 0; j < notas[0].length; j++) {
                System.out.println("Nota " + (j + 1) + ": " + notas[i][j]);
            }
            System.out.println("Promedio: " + promedios[i]);
        }

    }
}
