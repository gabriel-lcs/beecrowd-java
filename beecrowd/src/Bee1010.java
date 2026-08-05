import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1010 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int qntPecas = scanner.nextInt();
        double valorPeca = scanner.nextDouble();

        double peca =  qntPecas * valorPeca;

        codigo = scanner.nextInt();
        qntPecas = scanner.nextInt();
        valorPeca = scanner.nextDouble();

        peca +=  qntPecas * valorPeca;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", peca);
        scanner.close();
    }

}