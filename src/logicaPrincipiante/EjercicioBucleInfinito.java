package logicaPrincipiante;//NO HACER
import java.util.Scanner;

public class EjercicioBucleInfinito {
    public static void main (String[] args){


        /*
        int contador = 0;

        while (contador <= 10){
            System.out.println("Bucle infinito " + contador);
        }
         */

        boolean bandera = true;
        String respuesta;

        Scanner teclado = new Scanner(System.in);

        while(bandera == true){
            System.out.println("1. Suscrtito: " + bandera);
            System.out.println("2. ¿Quieres desuscribirte?");
            respuesta = teclado.next();
        /*
            if(respuesta.equalsIgnoreCase("Si")){
                bandera = false;
            }
         */
            System.out.println("----------------------------------");
        }

    }
}
