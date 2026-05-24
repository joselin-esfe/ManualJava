import java.util.Scanner;

public class Promedio12Numeros {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[12];

        int suma = 0;
        double promedio;


        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Ingrese un número:");
            numeros[i] = entrada.nextInt();

            suma = suma + numeros[i];
        }


        promedio = (double) suma / numeros.length;


        System.out.println("");
        System.out.println("El promedio es: " + promedio);
    }
}
