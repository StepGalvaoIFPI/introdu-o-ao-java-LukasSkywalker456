import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cálculo da Área do Triângulo");
        System.out.print("Digite a base do triângulo: ");
        double base = input.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double altura = input.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("Area = %.6f%n", area);

        input.close();
    }
}
