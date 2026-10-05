package logicaPrincipiante.matriz;

import java.util.Scanner;

public class EjercicioMatriz {
    public static void main(String[] args) {

        int matriz[][] = new int[3][4];

        Scanner teclado = new Scanner(System.in);

        System.out.println("Filas: " + matriz.length);
        System.out.println("Columnas: " + matriz[0].length);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Fila " + i + " | Columna " + j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Fila " + i + " | Columna " + j + ": " + matriz[i][j]);
            }
        }


        String nombres [][] = new String [2][2];
        teclado.nextLine();

        for(int i = 0; i < nombres.length; i++){
            for(int j = 0; j < nombres[0].length; j++){
                System.out.println("Nombre " + i + " | Apellido " + j);
                nombres[i][j] = teclado.nextLine();
            }
        }

        for(int i = 0; i < nombres.length; i++){
            for(int j = 0; j < nombres[0].length; j++){
                System.out.println("Nombre " + i + " | Apellido " + j + ": " + nombres[i][j]);
            }
        }

    }
}
