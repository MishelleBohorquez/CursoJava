public class EjercicioArrays {
    public static void main (String[] args){

        // [filas] | [filas] [Columas]
        int numeros [] = new int [5];
        numeros [0] = 12;
        numeros [1] = 16;
        numeros [2] = 17;
        numeros [3] = 20;
        numeros [4] = 24;

        System.out.println(numeros[2]);

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Indice: " + i + " | Valor: " + numeros[i]);
        }


        int[] numerosModernos = {1, 2, 3, 4, 5};
        System.out.println(numerosModernos[2]);

    }
}
