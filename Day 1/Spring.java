import java.util.Scanner;

public class Spring {
    
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month m : ");
        int m = sc.nextInt();
        System.out.println("Enter Day d : ");
        int d = sc.nextInt();

        if((m == 4 || m == 5) && (d > 0 && d <= 30)){
            System.out.println("Spring Season :True");
        }else if(m == 3 && d >= 20 ){
            System.out.println("Spring Season : True");
        }else if (m==6 && d<=20) {
            System.out.println("Spring Season :True");
        }
        else{
            System.out.println("Spring Season : False");
        }
        sc.close();
    }
}
