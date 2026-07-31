import java.io.IOException;
import java.util.Scanner;

public class Bee1004 {

    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        int a, b, prod;

        a = scanner.nextInt();
        b = scanner.nextInt();

        prod = a * b;

        System.out.printf("PROD = %d%n", prod);

        scanner.close();
    }

}