import java.util.Locale;
import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtd1, qtd2;
        double val1, val2, total;

        qtd1 = sc.nextInt();
        val1 = sc.nextDouble();

        qtd2 = sc.nextInt();
        val2 = sc.nextDouble();

        total = val1 * qtd1 + val2 * qtd2;

        System.out.println("Valor a ser pago: " + total);

        sc.close();
    }
}
