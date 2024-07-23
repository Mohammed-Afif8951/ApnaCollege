package Basic_Sorting;

public class Bubble_Sort {

    public static void bubble_sort_Optimized(int arr[]){// if it is best
        // case like all elements are sorted arr[] = {1,2,3,4,5}
        //then Time Compexcity = O(n)
        int No_Of_Swap = 0;
        for(int i=0; i<arr.length-1; i++){
            if(i>0 && No_Of_Swap==0){
                    break;
                } 
            No_Of_Swap =0;
            for(int j=0; j<arr.length-1-i; j++){        
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    No_Of_Swap++;
                }
            }
            
        }
    }  
    public static void bubble_sort(int arr[]){
        // for all case Time ComplexCity = O(n^2)
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){        
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                   
                }
            }
            
        }
    }
    public static void main(String[] args) {
        //int arr[] = {5,4,1,3,2};
        int arr[] = {1,2,5,4,3};
        //bubble_sort_Optimized(arr);
        bubble_sort(arr);
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}
