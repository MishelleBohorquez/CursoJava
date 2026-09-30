import java.util.Scanner;

public class EjercicioSwitch {
    public static void main (String[] args){

        int diaSemana;
        String nombreDia;

        System.out.println("DÍA DE LA SEMANA");
        System.out.println("Ingrese un número del 1 al 7");
        Scanner tecladoDiaSemana = new Scanner(System.in);
        diaSemana = tecladoDiaSemana.nextInt();

        switch (diaSemana){
            case 1: nombreDia = "Lunes";
                break;
            case 2: nombreDia = "Martes";
                break;
            case 3: nombreDia = "Miércoles";
                break;
            case 4: nombreDia = "Jueves";
                break;
            case 5: nombreDia = "Viernes";
                break;
            case 6: nombreDia = "Sábado";
                break;
            case 7: nombreDia = "Domingo";
                break;
            default: nombreDia = "Día incorrecto";
        }

        System.out.println("El día de la semana es: " + nombreDia);
    }
}