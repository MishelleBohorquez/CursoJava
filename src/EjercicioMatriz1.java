import java.util.Scanner;

public class EjercicioMatriz1 {
    public static void main(String[] args) {

        //Ejercicio 1
        String nombre [] = new String [8];

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < nombre.length; i++){
            System.out.println("Nombre " + i + ":");
            nombre[i] = teclado.nextLine();
        }

        for(int i = 0; i < nombre.length; i++){
            System.out.println("Nombre " + i + ": " + nombre[i]);
        }


        int numero[] = new int [10];

        for(int i = 0; i < numero.length; i++){
            System.out.println("Número " + i + ": ");
            numero[i] = teclado.nextInt();
        }

    }
}
