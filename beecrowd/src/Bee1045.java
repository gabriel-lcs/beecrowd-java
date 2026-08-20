import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1045 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double maior = a;
        double cateto1 = b;
        double cateto2 = c;

        if (b > a && b > c){
            maior = b;
            cateto1 = a;
        }
        else if (c > a && c > b) {
            maior = c;
            cateto2 = a;
        }

        if (maior >= cateto1 + cateto2){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else {
            if (maior * maior == cateto1 * cateto1 + cateto2 * cateto2){
                System.out.println("TRIANGULO RETANGULO");
            }
            else if (maior * maior > cateto1 * cateto1 + cateto2 * cateto2){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else{
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (maior == cateto1 && cateto1 == cateto2 && maior == cateto2){
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (maior == cateto1 || cateto1 == cateto2 || maior == cateto2) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        scanner.close();

    }

}