import java.util.Scanner;

public class exercicioOito {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

//        if (numero % 2 == 0) {
//            System.out.printf("PAR");
//
//        } else {
//            System.out.printf("ÍMPAR");
//        }
        System.out.printf((numero % 2 == 0) ? "PAR" : "ÍMPAR");

        sc.close();
    }
}
