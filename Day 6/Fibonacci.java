import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entere Nth term : ");
        int n = scanner.nextInt();

        int n1 = 0 , n2 = 1;
        System.out.print(n1+" "+n2+" ");
        for (int i = 1; i <= n; i++) {
                int n3 = n1 + n2;
                System.out.print(n3+" ");
                n1 = n2;
                n2 = n3;
        }
        scanner.close();
    }
}