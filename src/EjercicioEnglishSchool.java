import java.util.Scanner;

public class EjercicioEnglishSchool {
    public static void main(String[] args) {

        System.out.println("ENGLISH SCHOOL");
        System.out.println("Ingresa tu edad y conoce los horarios!");

        int edad;

        Scanner tecladoEdad = new Scanner(System.in);
        edad = tecladoEdad.nextInt();

        if (edad >= 4 && edad <= 6) {
            System.out.println("Kinder - Horario\nDías: Lunes y Miércoles\nHora: 16:00 - 17:00");
        } else if (edad == 7 || edad == 8) {
            System.out.println("1st - Horario\nDías: Martes y Jueves\nHora: 16:30 - 17:30");
        } else if (edad == 9 || edad == 10) {
            System.out.println("2nd - Horario\nDías: Martes y Jueves\nHora: 17:30 - 19:00");
        } else if (edad >= 11 && edad <= 13) {
            System.out.println("3rd - Horario\nDías: Lunes y Miércoles\nHora: 17:00 - 18:30");
        } else {
            System.out.println("No estas en el rango de edad de nuestra academía.");
        }
    }

}

