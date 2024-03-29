import java.util.Scanner;

/**
 * PrimeNumber
 */
public class PrimeNumber {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number :");
        int num = scanner.nextInt();


        // for (int i = 2; i <= num/2; i++) {
        //     if (num%i == 0) {
        //         flag = true;
        //         break;
        //     }
        // }
        // if (!flag) {
        //     System.out.println(num+" is Prime Number");
        // }
        // else{
        //     System.out.println(num +" is Not Prime number");
        // }

        System.out.println("Prime Numbers upto "+num+": ");
        for (int i = 2; i <= num; i++) {
            boolean flag = false;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
    
}
