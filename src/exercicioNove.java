import java.util.Scanner;

public class exercicioNove {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if ((A % B == 0) || (B % A == 0)) {
            System.out.printf("É múltiplo");
        } else {
            System.out.printf("Não é múltiplo");
        }

    }
}
