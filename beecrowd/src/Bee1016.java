import java.io.IOException;
import java.util.Scanner;

public class Bee1016 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int km = scanner.nextInt();

        scanner.close();

        System.out.printf("%d minutos%n", km * 2);

    }

}