package logica;
import igu.Principal;

public class EjemploIGU {
    public static void main(String[] args) {

        Principal ventana  = new Principal(); // Copia real de la ventana Principal y la guárda bajo el nombre ventana
        ventana.setVisible(true); // Visible al usuario
        ventana.setLocationRelativeTo(null); // Centrarlo en la pantalla

    }
}
