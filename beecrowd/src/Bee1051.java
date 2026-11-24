import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1051 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double renda = scanner.nextDouble();
        double imposto = 0.0;

        if (renda <= 2000){
            imposto = 0.0;
        } else {
            if (renda - 2000 < 1000){
                imposto += (renda - 2000) * (8 / 100.00);
            } else{
                imposto += 1000 * (8 / 100.00);

                if (renda - 3000 < 1500){
                    imposto += (renda - 3000) * (18 / 100.00);
                } else{
                    imposto += 1500 * (18 / 100.00);

                    imposto += (renda - 4500) * (28 / 100.00);
                }
            }
        }

        if (imposto == 0){
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        scanner.close();

    }

}