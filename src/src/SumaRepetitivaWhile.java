import java.util.Scanner;

public class SumaRepetitivaWhile {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int num1, num2, suma;
        String opcion = "si";


        while (opcion.equalsIgnoreCase("si")) {


            System.out.println("Ingrese el primer número:");
            num1 = entrada.nextInt();

            System.out.println("Ingrese el segundo número:");
            num2 = entrada.nextInt();


            suma = num1 + num2;


            System.out.println("La suma es: " + suma);

            entrada.nextLine();


            System.out.println("¿Desea continuar? (si/no)");
            opcion = entrada.nextLine();
        }

        System.out.println("Programa finalizado");
    }
}