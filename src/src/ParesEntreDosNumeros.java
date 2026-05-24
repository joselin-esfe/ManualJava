import java.util.Scanner;

public class ParesEntreDosNumeros {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int num1, num2;


        System.out.println("Ingrese el primer número:");
        num1 = entrada.nextInt();

        System.out.println("Ingrese el segundo número:");
        num2 = entrada.nextInt();


        while (num1 <= num2) {

            if (num1 % 2 == 0) {
                System.out.println(num1);
            }

            num1++;
        }
    }
}