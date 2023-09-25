import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class exercicioCinco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoProduto1, quantidadeProduto1, codigoProduto2, quantidadeProduto2;
        double valorProduto1, valorProduto2, valorTotal;

        codigoProduto1 = sc.nextInt();
        quantidadeProduto1 = sc.nextInt();
        valorProduto1 = sc.nextDouble();

        codigoProduto2 = sc.nextInt();
        quantidadeProduto2 = sc.nextInt();
        valorProduto2 = sc.nextDouble();


        valorTotal = quantidadeProduto1 * valorProduto1 + quantidadeProduto2 * valorProduto2;

        System.out.printf("Valor total a pagar: R$ %.2f", valorTotal);

        sc.close();



    }

}
