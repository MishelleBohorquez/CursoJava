package logicaPrincipiante.matriz;
import java.util.Scanner;

public class EjercicioMatriz3 {
    public static void main (String[] args){
/*
        //Ejercicio 3
        int numero[] = new int [15];
        int contador = 0;

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < numero.length; i++){
            System.out.println("Número (" + i + "): ");
            numero[i] = teclado.nextInt();
            if(numero[i] == 3){
                contador++;
            }
        }

        System.out.println("Veces de número 3: " + contador);
 */

        //Forma modular
        int numero[] = new int [15];
        int contador = 0;

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < numero.length; i++){
            System.out.println("Número (" + i + "): ");
            numero[i] = teclado.nextInt();
        }

        for(int i = 0; i < numero.length; i++){
            if(numero[i] == 3){
                contador++;
            }
        }

        System.out.println("Veces de número 3: " + contador);

    }
}
