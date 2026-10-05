package logicaPrincipiante;

public class EjercicioErrorDesbordamiento {
    public static void main(String[] args) {

        int vector[] = {1, 2, 3};

        System.out.println(vector[3]);

        for(int i = 0; i < 4; i++){
            System.out.println(vector[i]);
        }
    }
}