import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1005 {

    public static void main(String[] args) throws IOException
    {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, media;

        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();

        media = ((3.5 * nota1) + (7.5 * nota2)) / 11.0;

        System.out.printf("MEDIA = %.5f%n", media);

        scanner.close();
    }

}