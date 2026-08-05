import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1011 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        double raio = scanner.nextDouble();

        System.out.printf("VOLUME = %.3f%n", ((4.0/3.0) * pi * Math.pow(raio, 3)));

        scanner.close();
    }

}