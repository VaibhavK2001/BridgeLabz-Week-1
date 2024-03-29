/**
 * LargestElement
 */
public class LargestElement {

    public static void main(String[] args) {
        
        int[] arr = {10,2,14,23,21,12};
        int max = 0 ;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        
        System.out.println("Largest element in given Array : "+ max);
    }
}