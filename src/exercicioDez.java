import java.util.Scanner;

public class exercicioDez {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int horaTermino = sc.nextInt();
        int totalHoras;

        if (horaInicio < horaTermino) {
            totalHoras = horaTermino - horaInicio;
        } else {
            totalHoras = 24 - horaInicio + horaTermino;


        }

        System.out.printf("O jogo durou %d hora(s).", totalHoras);

    }
}
