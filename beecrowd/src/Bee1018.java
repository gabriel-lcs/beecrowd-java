import java.io.IOException;
import java.util.Scanner;

public class Bee1018 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int cem = 0, cinquenta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0, um = 0;

        System.out.println(n);

        while (true){
            if (n >= 100){
                cem ++;
                n -= 100;
            }
            else if (n >= 50){
                cinquenta ++;
                n -= 50;
            }
            else if (n >= 20){
                vinte ++;
                n -= 20;
            }
            else if (n >= 10){
                dez ++;
                n -= 10;
            }
            else if (n >= 5){
                cinco ++;
                n -= 5;
            }
            else if (n >= 2){
                dois ++;
                n -= 2;
            }
            else if (n >= 1){
                um ++;
                n -= 1;
            }
            else {
                break;
            }
        }

        System.out.printf("%d nota(s) de R$ 100,00%n", cem);
        System.out.printf("%d nota(s) de R$ 50,00%n", cinquenta);
        System.out.printf("%d nota(s) de R$ 20,00%n", vinte);
        System.out.printf("%d nota(s) de R$ 10,00%n", dez);
        System.out.printf("%d nota(s) de R$ 5,00%n", cinco);
        System.out.printf("%d nota(s) de R$ 2,00%n", dois);
        System.out.printf("%d nota(s) de R$ 1,00%n", um);

        scanner.close();

    }

}