import java.util.Scanner;

public class RevNum {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        int temp = 0;
        int r = 0;

        while (num > 0) {
            r = num % 10;
            temp = (temp*10)+r;
            num = num/10;
        }
        System.out.println(temp);
        sc.close();
    }
}
