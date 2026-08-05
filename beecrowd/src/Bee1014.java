import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1014 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();
        double combustivel = scanner.nextDouble();

        scanner.close();

        System.out.printf("%.3f km/l%n", distancia / combustivel);

    }

}