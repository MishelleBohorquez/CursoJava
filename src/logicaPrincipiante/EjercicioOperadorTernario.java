package logicaPrincipiante;

import java.util.Scanner;

public class EjercicioOperadorTernario {
    public static void main (String[] args){
        //Programa que depediendo del promedio de un alumno diga si aprobó o no una materia

        double promedio;
        String condicionFinal;

        System.out.println("Ingrese el promedio del alumno");
        Scanner tecladoPromedio = new Scanner(System.in);
        promedio = tecladoPromedio.nextDouble();

        condicionFinal = (promedio >= 6) ? "Aprobado" : "Reprobado";
        System.out.println("Alumno: " + condicionFinal + "\nEl promedio es: " + promedio);
    }
}
