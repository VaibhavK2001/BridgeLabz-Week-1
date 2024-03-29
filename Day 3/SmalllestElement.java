public class SmalllestElement {
    
    public static void main(String[] args) {
            
        int[] arr = {10,2,14,23,21,12};
       int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        
        System.out.println("Smallet element in given Array : "+ min);
    }
}
