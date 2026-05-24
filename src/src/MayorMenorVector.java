import java.util.Scanner;

public class MayorMenorVector {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        int mayor, menor;


        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Ingrese un número:");
            numeros[i] = entrada.nextInt();
        }


        mayor = numeros[0];
        menor = numeros[0];


        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }


        System.out.println("");
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
