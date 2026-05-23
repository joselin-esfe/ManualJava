import java.util.Scanner;

public class PromedioNotas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;

        System.out.println("Ingrese nota 1:");
        nota1 = entrada.nextDouble();

        System.out.println("Ingrese nota 2:");
        nota2 = entrada.nextDouble();

        System.out.println("Ingrese nota 3:");
        nota3 = entrada.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("");
        System.out.println("Promedio: " + promedio);
    }
}