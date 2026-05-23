import java.util.Scanner;

public class AreaCircunferencia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double radio, area;

        System.out.println("Ingrese el radio:");
        radio = entrada.nextDouble();

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("");
        System.out.println("El área es: " + area);
    }
}