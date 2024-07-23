package Basic_Sorting;

public class countingSort {
// find the largest element and create and count array of length largest+1 
// iterate the given array for every element in the given array make count[arr[i]]++ i.e,
// increase the count of that number
// then iterate the count array and then for each count add the element to the given array
    public static void counting_sort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        //create and initialize counting arrray
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sort 
        int j=0;
        for(int i=0; i<arr.length; i++){
            while(count[i]>0){
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }


    public static void counting_sort_descending(int arr[]){
        //find largest 
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        //create and initialize count array
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //sort
        int j=0;
        for(int i=count.length-1; i>=0; i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,1,6,9,10};
        counting_sort_descending(arr);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}
