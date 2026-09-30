// Estacionamiento

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args){

        String placa;
        int hora;

        double sumaHora = 0;
        double sumaMediaJornada = 0;
        double sumaJornadaCompleta = 0;

        int cantidadHora = 0;
        int cantidadMediaJornada = 0;
        int cantidadJornadaCompleta = 0;

        double totalHora;
        double totalMediaJornada;
        double totalJornadaCompleta;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Número de placa: ");
        placa = teclado.nextLine();

        while(!placa.equalsIgnoreCase("Fin")){
            System.out.println("Hora: ");
            hora = teclado.nextInt();

            if(hora < 5){
                totalHora = hora * 3;
                sumaHora += totalHora;
                cantidadHora++;
                System.out.println("Total estacionamiento: " + totalHora);
            } else if(hora < 10) {
                totalMediaJornada = (15 * 0.95) + ((hora - 5) * 3);
                sumaMediaJornada += totalMediaJornada;
                cantidadMediaJornada++;
                System.out.println("Total estacionamiento: " + totalMediaJornada);
            } else {
                totalJornadaCompleta = (30 * 0.9) + (hora / 10) + ((hora % 10) * 3);
                sumaMediaJornada += totalJornadaCompleta;
                cantidadJornadaCompleta++;
                System.out.println("Total estacionamiento: " + totalJornadaCompleta);
            }

            System.out.println("Placa: ");
            teclado.nextLine();
            placa = teclado.nextLine();

        }
        double ingresoTotal = sumaHora + sumaMediaJornada + sumaJornadaCompleta;

        System.out.println("------------------ Cantidades ------------------");
        System.out.println("Candad de estacionamiento por hora: " + cantidadHora);
        System.out.println("Candad de estacionamiento media jornada: " + cantidadMediaJornada);
        System.out.println("Candad de estacionamiento jornada completa: " + cantidadJornadaCompleta);
        System.out.println("\n------------------ Totales ------------------");
        System.out.println("Total de estacionamiento por hora: " + sumaHora);
        System.out.println("Total de estacionamiento media jornada: " + sumaMediaJornada);
        System.out.println("Total de estacionamiento jornada completa: " + sumaJornadaCompleta);
        System.out.println("Ingreso total: " + ingresoTotal);

    }
}
