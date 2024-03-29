public class ElementsOnOdd {
    
    public static void main(String[] args) {
        
        int[] arr = {10,2,14,23,21,12,22};

        System.out.println("Element on Odd position :");
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
            i++;
        }
    }
}
