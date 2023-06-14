import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int qtd = sc.nextInt();
        double valor;

        if (cod == 1) {
            valor = qtd * 4.0;
        } else if (cod == 2) {
            valor = qtd * 4.50;
        } else if (cod == 3) {
            valor = qtd * 5.0;
        } else if (cod == 4) {
            valor = qtd * 2.0;
        } else {
            valor = 1.50;
        }

        System.out.printf("Total: %.2f", valor);

        sc.close();
    }
}
