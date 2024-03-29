import java.util.Scanner;

public class StopWatch {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to start time :");
        int num=scanner.nextInt();

        if (num == 1) {
            long start = System.currentTimeMillis();
            boolean flag = true;
            while (flag) {
                System.out.println("Press 0 to stop time");
            int zero = scanner.nextInt();
            if (zero == 0) {
                long stop = System.currentTimeMillis();
                long time =  (stop - start)/1000;
                System.out.println("Elapse time : "+time+" sec");
                flag = false;
            }

            }
            
        }else{
            System.out.println("Invalid Input, Try Again!");
        }

        scanner.close();
    }
}
