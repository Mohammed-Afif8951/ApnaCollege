/*
 * Question1: Apply Merge sort to sort an array of Strings. (Assume that all the characters in all
 * the Strings are in lowercase). (EASY)
 
 * Sample Input 1: arr = { "sun", "earth", "mars", "mercury"}
 * Sample Output 1: arr = { "earth", "mars", "mercury","sun"}
 */
package Divide_And_Conquer.assignment;

public class Sort_String_Using_MergeSort {

    public static void sort_String_Using_MergeSort(String arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si)/2;
        sort_String_Using_MergeSort(arr, si, mid); //left
        sort_String_Using_MergeSort(arr, mid+1, ei); // right

        merge(arr,si,mid,ei);
    }

    public static void merge(String arr[], int si, int mid, int ei){
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j<=ei){
            if(arr[i].compareTo(arr[j]) < 0){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }


        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        for(k=0,i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
        
    }
    public static void main(String args[]){
        String arr[] = {"sun","earth","mars","mercury"};
        //String arr[] = {"ab","abc","a","abcd"};
        sort_String_Using_MergeSort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
