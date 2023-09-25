import java.util.Locale;
import java.util.Scanner;

public class exercicioQuatro {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salario;

        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.printf("Número do funcionário: %d%n", numeroFuncionario);
        System.out.printf("Salário do funcionário: R$ %.2f", salario);


        sc.close();


    }
}
