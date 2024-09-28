package Divide_And_Conquer;

public class Search_In_RotatedArray {

    public static int modified_Binary_Search(int arr[], int target, int si, int ei){
        if(si > ei){
            return -1;
        }

        int mid = si + (ei - si)/2; //mid = ( si + ei )/2;
        // case FOUND
        if(target == arr[mid]){
            return mid;
        }
        //if mid on line 1
        if(arr[si] <= arr[mid]){
            //case a: target on line 1 left
            if(target >= arr[si] && target<= arr[mid]){
                return modified_Binary_Search(arr, target, si, mid-1);
            }
            //case b: target on right 
            else{
                return modified_Binary_Search(arr, target, mid+1, ei);
            }
        }

        //if mid on line 2
        else{
            //case c: if target on line 2 right
            if(target >= mid && target <= arr[ei]){
                return modified_Binary_Search(arr, target, mid+1, ei);
            }
            //case d: if target is on left of mid
            else{
                return modified_Binary_Search(arr, target, si, mid-1);
            }
        }
            


        
    }
    
    public static int modified_Binary_Search_Iterative(int arr[], int target, int si, int ei){
        int mid = -1;
        while(si<=ei){
            mid = si + (ei - si)/2;
            if(target == arr[mid]){
                return mid;
            }
            //if mid is on line 1
            if(arr[si] <= arr[mid]){
                //case a: if target on line 1 left
                if(target >= arr[si] && target <= arr[mid]){
                    ei = mid-1;
                    continue;
                }
                //case b: if target is on right
                else{
                    si = mid+1;
                    continue;
                }

            }
            //if mid is on line 2
            else{
                //case c: if target is on line 2 right
                if(target <= arr[ei] && target >= arr[mid]){
                    si = mid+1;
                }
                //case d: if target is on left
                else{
                    ei = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        //int TarIndex = modified_Binary_Search(arr,target,0,arr.length-1);
        int TarIndex = modified_Binary_Search_Iterative(arr,target,0,arr.length-1);
        System.out.println(TarIndex);
    }
}
