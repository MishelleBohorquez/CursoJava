package logicaPrincipiante;

import java.util.Scanner;

public class EjercicioVariables {
    public static void main(String[] args) {

        int edad = 24;
        double altura = 1.53;
        boolean tengoPaseDeConducir = true;
        char inicialNombre = 'm';
        String direccion = "Calle 22. Apartamento 134";
        long numeroCedula = 222222222;

        System.out.println("Hola " + inicialNombre + ". \nTú edad es: " + edad + "\nTú altura es: " + altura);
        System.out.println("Estado de pase: " + tengoPaseDeConducir + ". La cual esta asociada a este número de cedula: " + numeroCedula);
        System.out.println("El pase llegará a este domicilio: " + direccion);


        System.out.println("Este programa es para sumar 2 números");
        int num1, num2;
        Scanner ingresoTeclado = new Scanner(System.in);
        System.out.println("Digite el primer número: ");
        num1 = ingresoTeclado.nextInt();
        System.out.println("Digite el segundo número: ");
        num2 = ingresoTeclado.nextInt();
        int suma = num1 + num2;

        System.out.println("La suma de los dos números es: " + suma);


        System.out.println("Este programa es para dividir 2 números");
        double numDividir1, numDividir2;
        Scanner ingresoTecladoDividir = new Scanner(System.in);
        System.out.println("Digite el primer número: ");
        numDividir1 = ingresoTecladoDividir.nextDouble();
        System.out.println("Digite el segundo número: ");
        numDividir2 = ingresoTecladoDividir.nextDouble();

        double division = numDividir1 / numDividir2;

        System.out.println("La división de los dos números es: " + division);
    }
}
