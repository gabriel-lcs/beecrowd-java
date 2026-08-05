import java.io.IOException;
import java.util.Scanner;

public class Bee1007 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, d;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        scanner.close();
        System.out.printf("DIFERENCA = %d%n", (a * b - c * d));
    }

}