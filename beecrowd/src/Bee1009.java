import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1009 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double salarioFix = scanner.nextDouble();
        double vendas = scanner.nextDouble();

        scanner.close();

        System.out.printf("TOTAL = R$ %.2f%n", salarioFix + (vendas * 0.15));
    }

}