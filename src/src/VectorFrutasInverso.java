import java.util.Scanner;

public class VectorFrutasInverso {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        String[] frutas = new String[10];


        for (int i = 0; i < frutas.length; i++) {

            System.out.println("Ingrese una fruta:");
            frutas[i] = entrada.nextLine();
        }


        System.out.println("");
        System.out.println("Frutas en orden inverso:");

        for (int i = frutas.length - 1; i >= 0; i--) {

            System.out.println(frutas[i]);
        }
    }
}
