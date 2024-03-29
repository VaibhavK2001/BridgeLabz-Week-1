import java.util.ArrayList;

public class DuplicateElements {
    
    public static void main(String[] args) {   
        int [] arr = {3, 4,3,2,4,7, 8, 8,3,8};
        System.out.println("Duplicate elements in given array: ");  
        ArrayList al = new ArrayList<Integer>();
        boolean isPresent = false;

        for(int i = 0; i < arr.length; i++) {  
            for(int j = i+1 + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) {
                    if (al.contains(arr[i])) {
                        break;
                    }
                    else{
                        al.add(arr[i]);
                        isPresent = true;
                    }
            }
            
        }
          
        }
        if (isPresent) {
            System.out.println(al);
        } 
    }   
}
