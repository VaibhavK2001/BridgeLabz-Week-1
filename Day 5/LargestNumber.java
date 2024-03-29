import java.util.Scanner;

public class LargestNumber {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entere Number 1 : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter Number 2 : ");
        int num2 = scanner.nextInt();

        System.out.println("Enter Number 3 : ");
        int num3 = scanner.nextInt();

        if(num2 < num1 && num3 < num1){
            System.err.println("Larget number : "+num1);
        }
        if (num2 > num1 && num2 > num1) {
            System.out.println("Largest Number is : "+num2);
        } else {
            System.out.println("Largest Number is : "+num3);
        }
        scanner.close();
    }
}
