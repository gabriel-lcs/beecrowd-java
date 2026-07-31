import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Bee1006 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a, b, c, media;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        media = ((a * 2) + (b * 3) + (c * 5)) / 10.0;

        System.out.printf("MEDIA = %.1f%n", media);
        scanner.close();
    }

}