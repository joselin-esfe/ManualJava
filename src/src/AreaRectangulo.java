import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        double base, altura, area;


        System.out.println("Ingrese la base:");
        base = entrada.nextDouble();

        System.out.println("Ingrese la altura:");
        altura = entrada.nextDouble();

        //Formula
        area = base * altura;

        //Resultado
        System.out.println("");
        System.out.println("El área del rectángulo es: " + area);
    }
}
