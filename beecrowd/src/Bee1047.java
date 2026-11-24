import java.io.IOException;
import java.util.Scanner;

public class Bee1047 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int horaInicio = scanner.nextInt();
        int minutoInicio = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();

        int hora = 0, minuto = 0;

        if (minutoFinal >= minutoInicio){
            minuto = minutoFinal - minutoInicio;
        }
        else {
            minuto = 60 - minutoInicio + minutoFinal;
        }


        if (horaFinal > horaInicio && minutoFinal >= minutoInicio){
            hora = horaFinal - horaInicio;
        }

        if (horaFinal > horaInicio && minutoFinal < minutoInicio){
            hora = horaFinal - horaInicio - 1;
        }

        if (horaFinal <= horaInicio && minutoFinal >= minutoInicio){
            hora = 24 - horaInicio + horaFinal;
            if(hora == 24 && minuto > 0){
                hora = 0;
            }
        }

        if (horaFinal <= horaInicio && minutoFinal < minutoInicio){
            hora = 23 - horaInicio + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", hora, minuto);
        scanner.close();

    }

}