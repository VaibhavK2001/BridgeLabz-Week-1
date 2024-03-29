import java.util.Random;

public class RandomNumber {
 
    public static int generateRandomNumber(int n) {
        // Generates a random number between 1 and N
        Random rand = new Random();
        return rand.nextInt(n) ;
    }

    public static void main(String[] args) {
        
        int randomNumber = generateRandomNumber(2);
        System.out.println(randomNumber);
    }
}
