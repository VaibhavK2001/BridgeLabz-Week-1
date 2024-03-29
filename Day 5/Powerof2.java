import java.util.Scanner;

public class Powerof2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of N (1 to 30):");
        int n = scanner.nextInt();
        System.out.println();

        if(0 < n && n <31){

            for (int i = 0; i <= n; i++) {
                System.out.println(2+"^"+i+"="+ (int)Math.pow(2, i));
            }
        }
        else{
            System.out.println("Enter valid value for N");
        }

        scanner.close();
    }
}
