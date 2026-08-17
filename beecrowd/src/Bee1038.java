import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1038 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int cod = scanner.nextInt();
        int qnt = scanner.nextInt();

        switch (cod){
            case 1 ->{
                System.out.printf("Total: R$ %.2f%n", 4.00 * qnt);
            }
            case 2 ->{
                System.out.printf("Total: R$ %.2f%n", 4.50 * qnt);
            }
            case 3 ->{
                System.out.printf("Total: R$ %.2f%n", 5.00 * qnt);
            }
            case 4 ->{
                System.out.printf("Total: R$ %.2f%n", 2.00 * qnt);
            }
            case 5 ->{
                System.out.printf("Total: R$ %.2f%n", 1.50 * qnt);
            }
        }

        scanner.close();

    }

}