import java.util.Scanner;

public class HarmonicNumber {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of N : ");
        int n = scanner.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0/i;
        }

        System.out.println("Harmonic Value for "+n+" = "+sum);

        scanner.close();
    }
    
}
