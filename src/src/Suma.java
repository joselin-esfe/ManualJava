import java.util.Scanner;
public class Suma {
    public  static void main(String[]args)
    {

        Scanner entrada =new Scanner(System.in);

        double num1, num2, suma;

        System.out.println("Escriba el primer numero");
        num1 = Double.parseDouble(entrada.next());

        System.out.println("Escriba el segundo numero");
        num2 = entrada.nextDouble();

        suma = num1 + num2;
        System.out.println("");
        System.out.println("La suma de los numeros es:" + suma);

    }

}
