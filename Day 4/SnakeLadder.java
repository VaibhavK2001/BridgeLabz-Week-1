import java.util.Random;

public class SnakeLadder {
    
    public static void main(String[] args) {
        
        System.out.println("===== WELCOME TO SNAKE LADDER GAME =====");
         int player = 0;
         int die = 0;
         int move = 0;
         int count = 0;
        
         Random random = new Random();
         while (player < 100) { 
            count++;
            die = random.nextInt(6)+1;
            move = random.nextInt(3)+1;

            switch (move) {
                case 1:
                    break;
                
                case 2:
                    player += die;
                    break;

                case 3:
                    player -= die;
                    break;
            }

            if (player < 0) {
                player = 0;
            }
            else if (player > 100) {
                player -= die;
            }

            System.out.println("Die Rolled : "+die+" |option : "+move +" | Position : "+player);

        }
       
            System.out.println("\n*********** You Win!!! ***********");
            System.out.println("Total dies = "+count);
        
    }   
}
