import java.util.Scanner;

public class PerfectNumber {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n%i == 0) {
                sum = sum + i; 
            }
        }

        if (n == sum){
            System.out.println(n+" is Perfect Number");
        }else{
            System.out.println(n+" is Not Perfect Number");
        }
        scanner.close();
    }
}
