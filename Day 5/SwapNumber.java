import java.util.Scanner;

public class SwapNumber {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entere Number 1 :");
        int x = scanner.nextInt();
        System.out.println("Entere Number 2 :");
        int y = scanner.nextInt();

        // using temp variable

        int temp=0; 
        temp = x;
        x = y;
        y = temp;

        System.out.println("Number 1 : "+x);
        System.out.println("Number 2 : "+y);

        // Without using temp variable

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("Without using temp");
        System.out.println("Number 1 : "+x);
        System.out.println("Number 2 : "+y);
        
        scanner.close();
    }
}
