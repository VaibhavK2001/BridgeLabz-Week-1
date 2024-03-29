public class ElementFrequency {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 1, 2, 3, 4, 1, 2, 1};

        int[] frequency = new int[1001]; 

        for (int num : array) {
            frequency[num]++;
        }

        System.out.println("Frequency of each element:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                System.out.println(i + ": " + frequency[i]);
            
      }
    }
 }
}