import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, resultado;


        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        resultado = a + b;


        System.out.printf("O resultado dessa soma é: " + resultado);

        sc.close();

    }
}