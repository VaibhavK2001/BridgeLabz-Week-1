public class ReveresArray {
    
    public static void main(String[] args) {
        
        int[] arr = {10,2,14,23,21,12,22};

        System.out.println("Reverse Array :");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
