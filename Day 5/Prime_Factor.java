import java.util.ArrayList;
import java.util.Scanner;

public class Prime_Factor {
    public static boolean prime(int x){
        if (x==1){
            return false;
        }
        if(x == 2 || x==3){
            return true;
        }
        if(x % 2 == 0 || x % 3 == 0){
            return false;
        }
        for(int i=5; i*i<=x;i=i+6){
            if(x%i == 0 || (x%(i+2) == 0 )){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the Number : ");
        int x = sc.nextInt();
        sc.close();
        for(int i=1;i<=x/2;i++){
            if(x%i == 0){
            if(prime(i)){
                arr.add(i);
            }
        }
    }
        System.out.println(arr);

   }
}