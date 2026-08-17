import java.io.IOException;
import java.util.Scanner;

public class Bee1019 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int horas = n / 3600;
        n -= horas * 3600;
        int minutos = n / 60;
        n -= minutos * 60;
        int segundos = n;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

        scanner.close();

    }

}