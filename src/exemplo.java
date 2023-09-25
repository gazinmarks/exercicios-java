import java.util.Locale;
import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double precoPlano = 50.00;
        int minutoTelefone = 100;
        double maisMinutos = 2.00;
        int minutosUsados;
        double valorTotal;

        minutosUsados = sc.nextInt();

        if (minutosUsados > 100) {
            valorTotal = precoPlano + (minutosUsados - minutoTelefone) * maisMinutos;
            System.out.printf("Valor a pagar: %.2f%n", valorTotal);
        } else {
            System.out.printf("Valor a pagar: %.2f%n", precoPlano);
        }

        sc.close();
    }
}
