import java.util.Scanner;

public class SumofN {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Nth term : ");
        int num = scanner.nextInt();
        int sum = 0; int  i = 1;
        while (i<=num) {
            sum += i;
            i++;
        }
        System.out.println("The Sum of "+num+" natural number is "+sum);
        scanner.close();
    }
}
