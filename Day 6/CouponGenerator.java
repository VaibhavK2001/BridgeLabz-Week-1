import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Coupon
 */
public class CouponGenerator {

    public static int[] generateCouponNumbers(int n) {
        // Generates N distinct coupon numbers
        int[] couponNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            couponNumbers[i] = i + 1;
        }
        return couponNumbers;
    }

    public static int generateRandomNumber(int n) {
        // Generates a random number between 1 and N
        Random rand = new Random();
        return rand.nextInt(n) + 1;
    }

    public static int generateDistinctCoupons(int n) {
        // Simulates the process of generating distinct coupon numbers
        Set<Integer> distinctCoupons = new HashSet<>();
        int totalRandomNumbers = 0;

        while (distinctCoupons.size() < n) {
            int randomNumber = generateRandomNumber(n);
            totalRandomNumbers++;
            distinctCoupons.add(randomNumber);
        }

        return totalRandomNumbers;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of distinct coupon numbers (N): ");
        int n = scanner.nextInt();
        scanner.close();

        int totalRandomNumbers = generateDistinctCoupons(n);
        System.out.println("Total random numbers needed to have all distinct numbers: " + totalRandomNumbers);
    }
}