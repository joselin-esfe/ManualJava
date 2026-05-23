import java.util.Scanner;

public class Hipotenusa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double cateto1, cateto2, hipotenusa;

        System.out.println("Ingrese el cateto 1:");
        cateto1 = entrada.nextDouble();

        System.out.println("Ingrese el cateto 2:");
        cateto2 = entrada.nextDouble();

        hipotenusa = Math.sqrt(
                Math.pow(cateto1, 2) +
                        Math.pow(cateto2, 2));

        System.out.println("");
        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}

