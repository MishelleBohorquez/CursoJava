package logicaPrincipiante;// FOR se usa con CONTADORES (ARRAYS)
/* Partes
1. Inicialización de la variable
2. Condicion de fin del ciclo
3. Modificación de la variable

for (iniciacilización; condicición; modificación){
    sentencia
}
*/

public class EjercicioFor {
    public static void main (String[] args){

        int suma = 0;

        for(int contador = 0; contador <= 10; contador++){
            System.out.println("Vuelta #: " + contador);
            suma = 5 + contador;

            if(suma >= 7){
                contador = 11;
            }
        }
    }
}
