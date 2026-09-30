import  java.util.Scanner;

public class EjercicioIf {
    public static void main(String[] args) {


        System.out.println("Programa para saber si es mayor o menor de edad");
        int edad;
        Scanner tecladoEdad = new Scanner(System.in);
        System.out.println("Digite su edad: ");
        edad = tecladoEdad.nextInt();

        if (edad > 18) {
            System.out.println("Eres mayor de edad");
            if (edad > 40) {
                System.out.println("Eres generación X");
            } else {
                System.out.println("Eres Milenial");
            }
        } else {
            if (edad == 18) {
                System.out.println("Tienes 18 años");
            } else {
                if (edad > 12) {
                    System.out.println("Eres adolescente");
                } else{
                    System.out.println("Eres infante");
                }
            }
        }

        System.out.println("Gracias por participar!");

    }
}
