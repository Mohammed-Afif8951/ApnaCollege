
public class Insertion_sort{

    public static void insertion_sort(int arr[]){
        //pick an element form the unsorted array and place in the right position in the sorted

        for(int i=1; i<arr.length; i++){
            int cur = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > cur){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insert into right position 
            arr[prev+1] = cur;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertion_sort(arr);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}


