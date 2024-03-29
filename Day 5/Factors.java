
public class Factors {
    
    public static void main(String[] args) {
        
        // Scanner scanner = new Scanner(System.in);
        
        // System.out.println("Enter Number :");
        // int n = scanner.nextInt();

        // System.out.println("Prime factors of "+n+" : ");

        // for (int i = 2; i <= n ; i++) {
        //     if (n%i == 0) {
                
        //         for (int j = 2; j < i; j++) {
                    
        //         }
        //     }
        // }

        // scanner.close();
    

            int N = 378; // Change N to the number for which you want to find prime factors
            
            System.out.print("Prime factors of " + N + ": ");
            primeFactors(N);
        }
    
        public static void primeFactors(int N) {
            // Print the number of 2s that divide N
            while (N % 2 == 0) {
                System.out.print(2 +" ");
                N /= 2;
            }
    
            // N must be odd at this point. So we can skip one element
            // (i++) after 2 and go to the next odd number.
            for (int i = 3; i * i <= N; i += 2) {
                // While i divides N, print i and divide N
                while (N % i == 0) {
                    System.out.print(i + " ");
                    N /= i;
                }
            }
    
            // This condition is to handle the case when N is a prime number greater than 2
            if (N > 2) {
                System.out.print(N);
            }
        }
    }



