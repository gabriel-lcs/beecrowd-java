import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1021 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextDouble();

        int cem = 0, cinquenta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0, um = 0, zeroCinquenta = 0, zeroVinteCinco = 0, zeroDez = 0, zeroCinco = 0, zeroUm = 0;

        int dinheiroNotas = (int) num;
        int dinheiroMoedas = (int) ((num - dinheiroNotas) * 100);

        cem = dinheiroNotas / 100;
        dinheiroNotas -= cem * 100;
        cinquenta = dinheiroNotas / 50;
        dinheiroNotas -= cinquenta * 50;
        vinte = dinheiroNotas / 20;
        dinheiroNotas -= vinte * 20;
        dez = dinheiroNotas / 10;
        dinheiroNotas -= dez * 10;
        cinco = dinheiroNotas / 5;
        dinheiroNotas -= cinco * 5;
        dois = dinheiroNotas / 2;
        dinheiroNotas -= dois * 2;
        um = dinheiroNotas;

        zeroCinquenta = dinheiroMoedas / 50;
        dinheiroMoedas -= zeroCinquenta * 50;
        zeroVinteCinco = dinheiroMoedas / 25;
        dinheiroMoedas -= zeroVinteCinco * 25;
        zeroDez = dinheiroMoedas / 10;
        dinheiroMoedas -= zeroDez * 10;
        zeroCinco = dinheiroMoedas / 5;
        dinheiroMoedas -= zeroCinco * 5;
        zeroUm = dinheiroMoedas;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n", cem);
        System.out.printf("%d nota(s) de R$ 50.00%n", cinquenta);
        System.out.printf("%d nota(s) de R$ 20.00%n", vinte);
        System.out.printf("%d nota(s) de R$ 10.00%n", dez);
        System.out.printf("%d nota(s) de R$ 5.00%n", cinco);
        System.out.printf("%d nota(s) de R$ 2.00%n", dois);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00%n", um);
        System.out.printf("%d moeda(s) de R$ 0.50%n", zeroCinquenta);
        System.out.printf("%d moeda(s) de R$ 0.25%n", zeroVinteCinco);
        System.out.printf("%d moeda(s) de R$ 0.10%n", zeroDez);
        System.out.printf("%d moeda(s) de R$ 0.05%n", zeroCinco);
        System.out.printf("%d moeda(s) de R$ 0.01%n", zeroUm);

        scanner.close();

    }

}