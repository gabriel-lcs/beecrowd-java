import java.io.IOException;
import java.util.Scanner;

public class Bee1049 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();

        String result = "";

        if (word1.equals("vertebrado")){
            if (word2.equals("ave")){
                if (word3.equals("carnivoro")){
                    result = "aguia";
                } else if (word3.equals("onivoro")) {
                    result = "pomba";
                }
            } else if (word2.equals("mamifero")) {
                if (word3.equals("onivoro")){
                    result = "homem";
                } else if (word3.equals("herbivoro")) {
                    result = "vaca";
                }
            }
        } else if (word1.equals("invertebrado")){
            if (word2.equals("inseto")){
                if (word3.equals("hematofago")){
                    result = "pulga";
                } else if (word3.equals("herbivoro")) {
                    result = "lagarta";
                }
            } else if (word2.equals("anelideo")) {
                if (word3.equals("hematofago")){
                    result = "sanguessuga";
                } else if (word3.equals("onivoro")) {
                    result = "minhoca";
                }
            }
        }

        System.out.println(result);

        scanner.close();

    }

}