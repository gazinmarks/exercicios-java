import java.util.Scanner;

public class exercicioSete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroInteiro;

        numeroInteiro = sc.nextInt();

        System.out.println((numeroInteiro >= 0) ? "Número positivo" : "Número negativo");


        sc.close();

    }
}
