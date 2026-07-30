import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1002 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double raio, pi = 3.14159;

        raio = scanner.nextDouble();

        System.out.printf("A=%.4f%n", pi * Math.pow(raio, 2));
    }

}