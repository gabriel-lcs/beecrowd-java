import java.io.IOException;
import java.util.Scanner;

public class Bee1046 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int tempo = 24;

        if (h2 > h1){
            tempo = h2 - h1;
        }
        else {
            tempo += - h1 + h2;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", tempo);

        scanner.close();

    }

}