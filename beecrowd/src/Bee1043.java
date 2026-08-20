import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1043 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a){
            System.out.printf("Perimetro = %.1f%n", a + b + c);
        }
        else{
            System.out.printf("Area = %.1f%n", ((a + b) * c) / 2);
        }

        scanner.close();

    }

}