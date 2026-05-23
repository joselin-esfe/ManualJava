import java.util.Scanner;

public class Descuento10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double compra, descuento, total;

        System.out.println("Ingrese el monto de compra:");
        compra = entrada.nextDouble();

        descuento = compra * 0.10;
        total = compra - descuento;

        System.out.println("");
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total);
    }
}
