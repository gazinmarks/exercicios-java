import java.util.Locale;
import java.util.Scanner;

public class exercicioOnze {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoItem = sc.nextInt();
        int quantItem = sc.nextInt();
        double resultado;

        if (codigoItem == 1) {
            resultado = quantItem * 4.00;
        } else if (codigoItem == 2) {
            resultado = quantItem * 4.50;
        } else if (codigoItem == 3) {
            resultado = quantItem * 5.00;
        } else if (codigoItem == 4) {
            resultado = quantItem * 2.00;
        } else  {
            resultado = quantItem * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", resultado);

        sc.close();
    }
}
