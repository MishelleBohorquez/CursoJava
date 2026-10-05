package logicaPrincipiante.matriz;

import java.util.Scanner;

public class EjercicioMatriz2 {
    public static void main(String[] args) {

        //Ejercicio 2
        int numero[] = new int[10];
        int numeroMayor = Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Número (" + i + "):");
            numero[i] = teclado.nextInt();

            if (numero[i] > numeroMayor) {
                numeroMayor = numero[i];
            }
            if (numero[i] < numeroMenor){
                numeroMenor = numero[i];
            }
        }

        System.out.println("Número mayor: " + numeroMayor);
        System.out.println("Número menor: " + numeroMenor);

    }
}