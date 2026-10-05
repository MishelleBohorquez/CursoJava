package logicaPrincipiante;

import java.util.Scanner;

public class EjercicioArrays {
    public static void main (String[] args){

        // [filas] | [filas] [Columas]
        int numeros [] = new int [5];
        /*
        numeros [0] = 1;
        numeros [1] = 2;
        numeros [2] = 3;
        numeros [3] = 4;
        numeros [4] = 5;
         */

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


        String apellidos[] = {"Bohorquez", "Rojas", "Cortes", "Lopez", "Arias", "Forero", "Perez"};

        System.out.println(apellidos[1]);

        for(int i = 0; i < apellidos.length; i++){
            System.out.println(apellidos[i]);
        }

        String nombres[] = new String [7];

        teclado.nextLine();

        for(int nom = 0; nom < nombres.length; nom++) {
            System.out.println("Nombre (" + nom + "):");
            nombres[nom] = teclado.nextLine();
        }

        for(int nom = 0; nom < nombres.length; nom++){
            System.out.println(nombres[nom]);
        }


    }
}
