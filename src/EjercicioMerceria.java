import java.util.Scanner;

public class EjercicioMerceria {
    public static void main(String[] args) {

            int cantidadCompra, envio;
            double costoCompra, total, descuento;

            Scanner teclado = new Scanner(System.in);

            System.out.println("Ingrese la cantidad de compra:");
            cantidadCompra = teclado.nextInt();

            if (cantidadCompra < 5) {
                System.out.println("Comprar mínimo 5 productos");
            } else {
                if (cantidadCompra <= 15) {
                    envio = 10;
                } else {
                    envio = 0;
                }
                System.out.println("Costo de envio: " + envio);

                System.out.println("Ingrese el costo de compra:");
                costoCompra = teclado.nextDouble();

                if (costoCompra < 100) {
                    descuento = 0;
                    System.out.println("Descuento: 0%");
                } else if (costoCompra <= 300) {
                    descuento = 0.05;
                    System.out.println("Descuento: 5%");
                } else {
                    descuento = 0.1;
                    System.out.println("Descuento: 10%");
                }
                total = costoCompra * (1 - descuento) + envio;
                System.out.println("Total a pagar: " + total);

                teclado.close();
            }
        }
}
