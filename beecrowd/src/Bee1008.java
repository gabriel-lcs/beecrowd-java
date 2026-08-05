import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1008 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numeroFun = scanner.nextInt();
        int horas = scanner.nextInt();
        double valorHora = scanner.nextDouble();

        scanner.close();

        System.out.printf("NUMBER = %d%n", numeroFun);
        System.out.printf("SALARY = U$ %.2f%n", horas * valorHora);
    }

}