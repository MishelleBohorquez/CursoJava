package logicaPrincipiante;

import java.util.Scanner;

public class EjercicioWhile {
    public static void main(String[] args){

        /*
        // While - Contador
        int contador = 0;

        while(contador < 10){
            System.out.println("Vuelta número: "+ contador);
            contador ++;
        }
         */

        /*
        // While - Centinela
        // Condicion contraria
        boolean bandera = true;
        String respuesta;

        Scanner teclado = new Scanner(System.in);

        while(bandera == true){
            System.out.println("1. Valor bandera: " + bandera);
            System.out.println("2. Suscrito: " + bandera);
            System.out.println("3. ¿Quieres desuscribirte?");
            respuesta = teclado.next();

            if(respuesta.equalsIgnoreCase("Si")){
                bandera = false;
            }

            System.out.println("----------------------------------");
        }
         */

        /*
        //While Centinela: 1. Ejemplo
        double retiro = 0, suma = 0;
        int numeroDeRetiro = 0;

        Scanner teclado = new Scanner(System.in);

        while (retiro != -1) {
            System.out.println("(-1 para salir)\nIngrese el valor del retiro:");
            retiro = teclado.nextDouble();

            if (retiro > 0) {
                numeroDeRetiro = numeroDeRetiro + 1;
                suma = suma + retiro;
                System.out.println("Suma retiros: " + suma);
            }
        }
        System.out.println("Suma total: "+ suma);
        System.out.println("Cantidad de retiros: "+ numeroDeRetiro);
         */

        //While Centinela: 2. Ejemplo
        int numero = 0, suma = 0, cantidad = 0;
        Scanner teclado = new Scanner(System.in);

        while(numero != -1){
            System.out.println("Introduce un número (-1 para salir):");
            numero = teclado.nextInt();
            if(numero > 0 ){
                cantidad ++;
                suma = suma + numero;
            }
        }
        System.out.println("Suma total: " + suma);
        System.out.println("Cantidad de números: " + cantidad);
    }
}
