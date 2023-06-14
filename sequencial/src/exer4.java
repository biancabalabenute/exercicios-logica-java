import java.util.Locale;
import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valorHora, salario;

        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = horas * valorHora;

        System.out.println("Numero: " + numero);
        System.out.println("Salario: " + salario);
    }
}
