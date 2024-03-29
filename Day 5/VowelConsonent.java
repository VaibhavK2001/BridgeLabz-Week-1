import java.util.Scanner;

public class VowelConsonent {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Character : ");
        char c = scanner.nextLine().charAt(0);
        
        if ( c == 'a' ||c == 'A' || c =='e' || c == 'E'|| c == 'I'|| c=='i'||c == 'o'|| c=='O'||c == 'U'|| c=='u'){
            System.out.println(c+" is Vowel");
        }else{
            System.out.println(c+" is Consonent");
        }
        scanner.close();
    }
}
