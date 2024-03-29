import java.util.Scanner;

public class ReverseNum {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scanner.nextInt();

        int temp=0;
        int r = 0;

        while (num > 0) {
            r = num % 10;
            temp = (temp*10)+r;
            num = num/10;
        }

        System.out.println("Reverse Number : "+temp);
        scanner.close();
    }
}
