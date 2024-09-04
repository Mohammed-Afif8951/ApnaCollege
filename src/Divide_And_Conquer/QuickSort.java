package Divide_And_Conquer;

public class QuickSort {

    public static void quickSort(int arr[],int si, int ei){
        if(si >= ei){
            return;
        }

        //find pivot point index 
        int pIndx = partition(arr,si,ei);
        quickSort(arr, si, pIndx-1); //Left
        quickSort(arr, pIndx+1, ei); //Right
    }

    public static int partition(int arr[], int si, int ei){
        //find pivot point
        int pivot = arr[ei];
        int i = si-1; //to make place for elements smaller than pivot

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // place pivot in right position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
