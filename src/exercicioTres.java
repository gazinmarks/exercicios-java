import java.util.Locale;
import java.util.Scanner;

public class exercicioTres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferencaSoma;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();


        diferencaSoma = A * B - C * D;

        System.out.printf("A diferença é de: %d", diferencaSoma);
        sc.close();


    }
}
