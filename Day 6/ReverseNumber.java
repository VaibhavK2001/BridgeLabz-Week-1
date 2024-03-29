import java.util.Scanner;

public class ReverseNumber {
        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number to Reverse : ");
        int num = scanner.nextInt();

        int r=0, rev=0;

        while (num>0) {
            r = num%10;
            rev = (rev * 10)+r;
            num = num/10;
        }

        System.out.println(rev);
        scanner.close();
    }
    
}
