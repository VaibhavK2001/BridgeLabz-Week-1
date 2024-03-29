import java.util.Scanner;

public class LineComparison {

    public static int cartesianSystem(int x1,int y1,int x2,int y2){

        return (int) Math.sqrt((int)Math.pow(x2-x1, 2) + (int)Math.pow(y2-y1, 2));
    }
    public static void main(String[] args) {
        
        System.out.println("Welcome to Line Comparison Computation Program\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values of X1 and Y1");
        System.out.println("X1 : ");
        int x1 = scanner.nextInt();
        System.out.println("Y1 : ");
        int y1 = scanner.nextInt();
        System.out.println("Enter values of X2 and Y2");
        System.out.println("X2 : ");
        int x2 = scanner.nextInt();
        System.out.println("Y2 : ");
        int y2 = scanner.nextInt();

        int dist = cartesianSystem(x1, y1, x2, y2);
        System.out.println("\nLength of line using Cartesian System : "+dist+" units");

        System.out.println("\nComparison of two lines\n");
        System.out.println("\nEnter Co-ordinates of 2nd Line :");
        System.out.println("X1 : ");
        int p1 = scanner.nextInt();
        System.out.println("Y1 : ");
        int q1 = scanner.nextInt();
        System.out.println("X2 : ");
        int p2 = scanner.nextInt();
        System.out.println("Y2 : ");
        int q2 = scanner.nextInt();
        
        String line1 = String.valueOf(cartesianSystem(x1, y1, x2, y2));
        String line2 = String.valueOf(cartesianSystem(p1, q1, p2, q2));

        System.out.println("\nLength of line 1 : "+line1);
        System.out.println("Length of line 2 : "+line2);
        boolean flag = line1.equals(line2);
        if (flag) {
            System.out.println("\nTwo Lines are equal");
        }
        else{
            System.out.println("\nTwo Lines are Not equal");
          }
        int value = line1.compareTo(line2);
        if (value < 0) {
            System.out.println("\nLine 1 is less than line 2 ");
        }else if (value > 0) {
            System.out.println("\nLine 1 is greater than line 2");
        }

        scanner.close();

    }

}
