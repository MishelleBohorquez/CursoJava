import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Ejercicio 1
        System.out.println("------ Ejercicio 1 ------");
        int numeros = 0;

        while (numeros <= 35) {
            System.out.println("Número: " + numeros);
            numeros++;
        }

        //Ejercicio 2
        System.out.println("------ Ejercicio 2 ------");
        int limiteNumerico = 0;

        Scanner teclado = new Scanner(System.in);

        while (limiteNumerico <= 100) {
            System.out.println("Ingrese un número (1 - 100): ");
            limiteNumerico = teclado.nextInt();

            if (limiteNumerico > 100) {
                System.out.println("Número es mayor a 100");
            } else {
                System.out.println("Número: " + limiteNumerico);
            }
        }

        int imprimirNumeros;

        System.out.println("Ingrese un número (1 -100):");
        imprimirNumeros = teclado.nextInt();

        for(int i = 0; i < imprimirNumeros; i++){
            if(imprimirNumeros <= 100){
                System.out.println(i+1);
            }
        }

        //Ejercicio 3
        System.out.println("------ Ejercicio 3 ------");
        for (int numerosPares = 200; numerosPares <= 250; numerosPares += 2) {
            System.out.println("Número: " + numerosPares);
        }

        //Ejercicio 4
        System.out.println("------ Ejercicio 4 ------");
        for (int cuentaRegresiva = 10; cuentaRegresiva >= 1; cuentaRegresiva--) {
            System.out.println("Número: " + cuentaRegresiva);
        }

        for(int contadorCinco = 0; contadorCinco <= 35; contadorCinco+=5) {
            System.out.println("Número: " + contadorCinco);
        }

        for(int ascensor = 10; ascensor > 0; ascensor--){
            if(ascensor != 4){
                System.out.println("Piso #: " + ascensor);
            }
        }

        //Ejercicio 5
        System.out.println("------ Ejercicio 5 ------");
        String palabra = "";

        while (!palabra.equalsIgnoreCase("Salir")) {
            System.out.println("Ingrese una palabra (Salir): ");
            palabra = teclado.next();
            if (!palabra.equalsIgnoreCase("Salir")) {
                System.out.println("Palabra: " + palabra);
            }
        }

        String palabraEjemplo;
        System.out.println("Ingrese una palabra (Salir): ");
        palabraEjemplo = teclado.nextLine();

        while(!palabraEjemplo.equalsIgnoreCase("Salir")){
            System.out.println("Palabra: " + palabraEjemplo);

            System.out.println("Ingrese una palabra (Salir): ");
            palabraEjemplo = teclado.nextLine();
        }
        System.out.println("¡Fin del programa!");

    }
}