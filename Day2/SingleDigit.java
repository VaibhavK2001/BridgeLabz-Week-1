import java.util.Scanner;

/**
 * SingleDigit
 */
public class SingleDigit {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Single Digit Number : ");
        int num = scanner.nextInt();

        if (num < 10 && num >= 0){
            
            if (num == 0) {
                System.out.println("The Digit is Zero");
            }
            else if (num == 1){
                System.out.println("The Digit is One");
            }
            else if (num == 2) {
                System.out.println("The Digit is Two");
            }
            else if (num == 3) {
                System.out.println("The Digit is Three");
            }
            else if(num == 4){
                System.out.println("The Digit is Four");
            }
            else if(num == 5){
                System.out.println("The Digit is Five");
            }
            else if(num == 6){
                System.out.println("The Digit is Six");
            }
            else if(num == 7){
                System.out.println("The Digit is Seven");
            }
            else if(num == 8){
                System.out.println("The Digit is Eight");
            }
            else{
                System.out.println("The Digit is Nine");
            } 
        }
        else{
            System.out.println("Please enter Single Digit number");
        }
        scanner.close();
    }
}