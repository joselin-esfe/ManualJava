import java.util.Scanner;

public class NumerosParesWhile {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int numero, contador = 0;


        System.out.println("Ingrese un número:");
        numero = entrada.nextInt();


        while (contador <= numero) {

            if (contador % 2 == 0) {
                System.out.println(contador);
            }

            contador++;
        }
    }
}