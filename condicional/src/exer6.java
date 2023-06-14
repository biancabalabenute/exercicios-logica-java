import java.util.Locale;
import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero = sc.nextDouble();

        if (numero < 0 || numero > 100) {
            System.out.println("Fora do intervalo");
        } else if (numero <= 25) {
            System.out.println("Entre 0 e 25");
        } else if (numero <= 50) {
            System.out.println("Entre 25 e 50");
        } else if (numero <= 75) {
            System.out.println("Entre 50 e 75");
        } else {
            System.out.println("Entre 75 e 100");
        }

        sc.close();
    }
}
