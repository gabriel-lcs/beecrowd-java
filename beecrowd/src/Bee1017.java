import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1017 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int horas = scanner.nextInt();
        int velocidade = scanner.nextInt();

        scanner.close();

        System.out.printf("%.3f%n", (horas * velocidade) / 12.0);

    }

}