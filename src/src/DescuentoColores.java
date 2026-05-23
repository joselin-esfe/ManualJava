import java.util.Scanner;

public class DescuentoColores {

    public static void main(String[] args) {

        // instancia Scanner
        Scanner entrada = new Scanner(System.in);

        double compra, descuento = 0, total;
        String color;

        // captura de datos
        System.out.println("Ingrese el monto de la compra:");
        compra = entrada.nextDouble();

        entrada.nextLine();

        System.out.println("Ingrese el color de la etiqueta:");
        color = entrada.nextLine();

        // proceso
        if (color.equalsIgnoreCase("verde")) {
            descuento = compra * 0.05;
        } else if (color.equalsIgnoreCase("roja")) {
            descuento = compra * 0.10;
        } else if (color.equalsIgnoreCase("azul")) {
            descuento = compra * 0.15;
        } else if (color.equalsIgnoreCase("dorada")) {
            descuento = compra * 0.20;
        } else {
            System.out.println("Color no válido");
        }

        total = compra - descuento;

        // mostrar resultados
        System.out.println("");
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + total);
    }
}
