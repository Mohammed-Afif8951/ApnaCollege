package Divide_And_Conquer;

public class Merge_Sort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void merge_Sort(int arr[],int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2; // mid = (si + ei)/2;
        merge_Sort(arr, si, mid);
        merge_Sort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i=si; // index for 1 sorted part 
        int j=mid+1; // index for 2 sorted part
        int k = 0; // index for temp array

        while(i <= mid &&  j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for 1 remaining sorted part 
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        // for 2 remaining sorted part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // copy the temp array to the original array
        for(k=0, i=si; k<temp.length; i++, k++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        merge_Sort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
