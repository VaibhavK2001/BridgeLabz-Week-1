public class SecondLargest{
    
    public static void main(String[] args) {
        int[] arr = {10,23,2,14,23,21,12};
        int temp = 0;
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp; 
                }

            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]!=arr[0]) {
                System.out.println();
                System.out.println("Second largest element : "+arr[i]);
                i = arr.length;
            }
        }
        
    }
}
