import java.io.IOException;
import java.util.Scanner;

public class Bee1001 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.printf("X = %d%n", a + b);

    }

}