import java.util.Scanner;

/**
 * HeadTails
 */
public class HeadTails {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of Coin Flips : ");
        int numFlip = scanner.nextInt();

        if (numFlip <= 0){
            System.err.println("Enter Positive Number!");
        }
        else{
            int head = 0;
            int tails = 0;

            double random = Math.random();

            for (int i = 0; i < numFlip; i++) {
                if (random < 0.5) {
                    tails++;
                }else{
                    head++;
                }
            }

            double tailsPercentage = ((double)tails/numFlip)*100;
            double headPercentage = ((double)head/numFlip)*100;

            System.out.println("Random Value "+random);
            System.out.println("Percentage of Heads "+headPercentage+"%");
            System.out.println("Percentage of Tails "+tailsPercentage+"%");
        }
        scanner.close();
    }
    
}

