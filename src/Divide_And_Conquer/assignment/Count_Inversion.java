/*
 * Question 3 :Given an array of integers. Find the Inversion Count in the array.(HARD)
 * Inversion Count: For an array, inversion count indicates how far(or close) the array 
 * is from being sorted. If the array is already sorted then the inversion count is 0.
 * If an array is sorted in the reverse order then the inversion count is the maximum.
 
 * Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 
 * Sample Input 1: N = 5, arr[ ] = {2, 4, 1, 3, 5}
 * Sample Output 1: 3, 
 * because it has 3 inversions -(2, 1), (4, 1), (4, 3). 
 
 * Sample Input 2: N = 5, arr[ ] = {2, 3, 4, 5, 6} 
 * Sample Output 2: 0, 
 * because the array is already sorted 
 
 * Sample Input 3: N = 3, arr[] = {5, 5, 5}
 * Sample Output 3: 0, 
 * because all the elements of the array are the same & already in a sorted manner.
 
 *  (Hint: A sorting algorithm will be used to solvethis question.)
 *  Note- This question is important. Even if you are not able to come up with the approach, 
 *  please understand the solution.
 */
package Divide_And_Conquer.assignment;

public class Count_Inversion {
//---------------------------------------BruteForce---------------------------------
    public static void count_Inversion_BruteForce(int arr[]){
            int count = 0;
            for(int i=0; i<arr.length; i++){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i] > arr[j]){
                        count++;
                        System.out.print("("+arr[i]+","+arr[j]+") ");
                    }
                }
            }
            System.out.println("\nThe Inversion Count is "+count);
        }

      
//---------------------------------Divide and Conquer(Merge Sort Method)------------------------------------
        public static int count_Inversion(int arr[], int si, int ei){
            int invCount = 0;
            if(si < ei){
                int mid = si + (ei - si)/2;
                invCount += count_Inversion(arr, si, mid);
                invCount += count_Inversion(arr, mid+1, ei);
                invCount += merge(arr, si, mid, ei);
            }
            return invCount;
        }

        public static int merge(int arr[], int si, int mid, int ei){
            int temp[] = new int[ei-si+1];
            int invCount= 0;
            int i = si;
            int j = mid+1;
            int k = 0;

            while(i <= mid && j <= ei){
                if(arr[i] <= arr[j]){
                    temp[k] = arr[i];
                    i++;
                }
                // arr[i] > arr[j];
                else{
                    temp[k] = arr[j];
                    j++;
                    invCount += (mid - i)+1;
                    
                }
                k++;
            }
            while(i <= mid){
                temp[k++] = arr[i++];
            }
            while(j <= ei){
                temp[k++] = arr[j++];
            }

            for(k=0, i=si; k<temp.length; k++,i++){
                arr[i] = temp[k];
            }
            return invCount;
        }
    public static void main(String[] args) {
        //int arr1[] = {2,4,1,3,5};
        int arr1[] = {5,3,2,4,1};
        //count_Inversion_BruteForce(arr1);
        int invCount = count_Inversion(arr1, 0, arr1.length-1);
        // for(int i=0; i<arr1.length; i++){
        //     System.out.print(arr1[i]+" ");
        // }
        System.out.println(invCount);
        
    }
}
