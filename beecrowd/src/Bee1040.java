import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1040 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float n3 = scanner.nextFloat();
        float n4 = scanner.nextFloat();

        float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10.0f;

        System.out.printf("Media: %.1f%n", media);

        if (media > 7){
            System.out.println("Aluno aprovado.");
        }
        else if (media >= 5 && media < 7) {
            System.out.println("Aluno em exame.");

            float notaMedia = scanner.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", notaMedia);

            float novaMedia = (media + notaMedia) / 2.0f;

            if (novaMedia >= 5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", novaMedia);
            }
            else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", novaMedia);
            }
        }
        else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();

    }

}