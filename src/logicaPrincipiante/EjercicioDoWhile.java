package logicaPrincipiante;

/* DO WHILE
1. Casi no se usa}
2. Entra al menos una vez
Nota: Probar cambiando el contador = 50 y ver la terminal
*/
public class EjercicioDoWhile {
    public static void main (String [] args){

        int contador = 0;

        do{
            System.out.println("Estoy en la vuelta: " + contador);
            contador ++; // contador +=1;
        } while (contador < 10);
    }
}
