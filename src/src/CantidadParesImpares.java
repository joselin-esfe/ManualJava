import java.util.Scanner;

public class CantidadParesImpares {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[12];

        int pares = 0;
        int impares = 0;


        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Ingrese un número:");
            numeros[i] = entrada.nextInt();
        }


        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }


        System.out.println("");
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
