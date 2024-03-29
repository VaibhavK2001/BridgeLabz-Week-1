import java.util.Scanner;

public class QuotientReminder {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Divident :");
        int divident = scanner.nextInt();

        System.out.println("Enter Divisor : ");
        int divisor = scanner.nextInt();


        int q = divident/divisor;
        int r = divident%divisor;

        System.out.println("Quotient = "+q);
        System.out.println("Reminder = "+r);

        scanner.close();
    }
}
