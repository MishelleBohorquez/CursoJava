package logicaPrincipiante;// Estacionamiento

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args){
        /*
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
         */

        //LogicaPrincipiante.Ejercicio2: Elegir opción.

        int opcion, hora, contador1 = 0, contador2 = 0, contador3 = 0;
        String placa;
        double total, totalDia = 0;

        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite la placa (Salir):");
        placa = teclado.nextLine();

        while (!placa.equalsIgnoreCase("Salir")) {

            System.out.println("------- Menú -------");
            System.out.println("1. Por hora");
            System.out.println("2. Media Jornada");
            System.out.println("3. Jornada Completa");

            System.out.println("Seleccione (1 - 3): ");
            opcion = teclado.nextInt();

            if(opcion == 1){
                System.out.println("Digite la hora: ");
                hora = teclado.nextInt();
                total = hora * 3;
                System.out.println("Valor a pagar: $" + total + " USD");
                contador1++;
                totalDia += total;
            } else if (opcion == 2){
                total = 15 - (15 * 0.05);
                System.out.println("Valor a pagar: $" + total + " USD");
                contador2 ++;
                totalDia += total;
            } else if (opcion == 3){
                total = 30 - (30 * 0.1);
                System.out.println("Valor a pagar: $" + total + " USD");
                contador3 ++;
                totalDia += total;
            } else {
                System.out.println("Opción invalida");
            }

            System.out.println("\nGracias por su compra!\n");
            System.out.println("Digite la placa (Salir)");
            teclado.nextLine();
            placa = teclado.nextLine();
        }


        System.out.println("\n--------- Ingresos ---------\n");

        System.out.println("Estacionamiento 1: " + contador1);
        System.out.println("Estacionamiento 2: " + contador2);
        System.out.println("Estacionamiento 3: " + contador3);
        System.out.println("Total ingreso: $" + totalDia + " USD");

    }
}
