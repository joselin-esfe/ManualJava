import java.util.Scanner;

public class Par {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Escriba un número entero");
        num = entrada.nextInt();

        if(num%2 == 0)
            System.out.println("El número es par");
        else
            System.out.println("El número es impar");
    }
}
