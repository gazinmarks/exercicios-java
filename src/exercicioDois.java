import java.util.Locale;
import java.util.Scanner;

public class exercicioDois {

    public static void main(String [] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio;
        double resultado;

        raio = sc.nextDouble();

        resultado = pi * (Math.pow(raio, 2.0));

        System.out.printf("O resultado da área é %.4f", resultado);

        sc.close();


    }
}
