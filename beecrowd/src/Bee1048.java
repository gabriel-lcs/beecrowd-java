import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1048 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();

        int percent = 0;
        double reajuste = 0;

        if (salary >= 0 && salary <= 400){
            percent = 15;
            reajuste = salary * (percent / 100.00);
            salary += reajuste;
        } else if (salary > 400 && salary <= 800){
            percent = 12;
            reajuste = salary * (percent / 100.00);
            salary += reajuste;
        } else if (salary > 800 && salary <= 1200){
            percent = 10;
            reajuste = salary * (percent / 100.00);
            salary += reajuste;
        } else if (salary > 1200 && salary <= 2000){
            percent = 7;
            reajuste = salary * (percent / 100.00);
            salary += reajuste;
        } else {
            percent = 4;
            reajuste = salary * (percent / 100.00);
            salary += reajuste;
        }

        System.out.printf("Novo salario: %.2f%n", salary);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %d %%%n", percent);

        scanner.close();

    }
}