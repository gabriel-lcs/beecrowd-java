import java.io.IOException;
import java.util.Scanner;

public class Bee1020 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        int anos = 0, meses = 0, dias = 0;

        while (true){
            if (n >= 365){
               anos ++;
               n -= 365;
            }
            else if (n >= 30) {
                meses ++;
                n -= 30;
            }
            else if (n >= 1) {
                dias ++;
                n -= 1;
            }
            else {
                break;
            }
        }

        System.out.printf("%d ano(s)%n", anos);
        System.out.printf("%d mes(es)%n", meses);
        System.out.printf("%d dia(s)%n", dias);

    }

}