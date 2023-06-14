import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("IMPOSSIVEL");
            } else {
                double div = (double) x / y;
                System.out.println(div);
            }
        }
        sc.close();
    }
}
