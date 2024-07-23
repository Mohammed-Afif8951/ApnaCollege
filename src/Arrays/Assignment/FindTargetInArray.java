/* 
    There is an integer array nums sorted in ascendting order (with distinct values).
    Prior to being passed to your function, nums is possibly rotated at an 
    unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  
    is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed). 
    For   example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
    Given the array nums after the possible rotation and an integer target, returnthe index of 
    target if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n)
    runtime complexity.

*/

/*      
    arr[] = {1,2,3,4,5,6,7}
    
    // rotate p times

    example p = 3
    arr[] = {4,5,6,7,1,2,3}

    find target index if it is in the array 
    else return -1

 */
package Arrays.Assignment;



public class FindTargetInArray {

    public static int search(int arr[], int target){

        // solve using O(log n) time complexity -- binary search algorithm
        // arr[] = {4,5,6,7,0,1,2}
        //find minimum element in the array
        // it is looking like two sorted array [4,5,6,7] and [0,1,2]
        // if target >= min and target <= arr.length-1 search right 
        // else search left 


        int min = findMin(arr);

        // find in right side of min or in between min and last element 
        if(target >= arr[min] && target <= arr[arr.length-1]){
            return findTargetInArray(arr, min, arr.length-1, target);
        }
        // find between 0 to min or left side of min
        else{
            return findTargetInArray(arr, 0, min-1, target);
        }
    }
    public static int findTargetInArray(int arr[], int left, int right, int target){
        // int left = l;
        // int right = r;
        while(left<=right){
            int mid = left + (right -left)/2;

            if(target == arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;  
}

    public static int findMin(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
           int mid = left + (right - left)/2;
            //[1,2,4,5,6,7,0]
            //[2,4,5,6,7,0,1]
            //[4,5,6,7,0,1,2]
            //[5,6,7,0,1,2,4]
            //[6,7,0,1,2,4,5]
            //[7,0,1,2,4,5,6]
            //[0,1,2,4,5,6,7]
            
           if(mid > 0 && arr[mid-1] > arr[mid]){
            return mid;
           }
           // didn't find mid search if it is in right 
           
           else if(arr[left] <= arr[mid] && arr[mid] > arr[right]){
            // the mid is inside mid to right
            left = mid+1;
           }
           else{ // the mid is inside left to mid
            right = mid-1;
           }
        }
        return left;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 3;
        int min = search(arr, target);
        if(min>=0){
            System.out.println(target+" is at "+min+" index");
        }else{
            System.out.println("The target is not found");
        }
        
}
}