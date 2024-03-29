public class AscendingOrder {
    
    public static void main(String[] args) {
        
        int[] arr = {10,2,14,23,21,12};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp; 
                }

            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
