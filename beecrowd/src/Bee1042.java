import java.io.IOException;
import java.util.Scanner;

public class Bee1042 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int maior = 0;
        int menor = 0;
        int meio = 0;

        if (n1 > n2 && n1 > n3){
            maior = n1;
            if (n2 > n3){
                meio = n2;
                menor = n3;
            }
            else {
                meio = n3;
                menor = n2;
            }
        }
        else if (n2 > n3) {
            maior = n2;
            if (n3 > n1){
                menor = n1;
                meio = n3;
            }else {
                menor = n3;
                meio = n1;
            }
        }
        else {
            maior = n3;
            if (n2 > n1){
                menor = n1;
                meio = n2;
            }
            else {
                menor = n2;
                meio = n1;
            }
        }

        System.out.printf("%d%n%d%n%d%n%n%d%n%d%n%d%n", menor, meio, maior, n1, n2, n3);
        scanner.close();

    }

}