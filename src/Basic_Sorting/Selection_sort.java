package Basic_Sorting;
//1st Iteration: find the minimum element and put it in the 1st position 
//2nd iteration: find the minimum element and put it in the 2nd position 
//and so on.
public class Selection_sort {
    public static void selection_Sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void selection_Sort_descending(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[minPos]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selection_Sort_descending(arr);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}
