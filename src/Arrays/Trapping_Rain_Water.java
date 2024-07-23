package Arrays;

public class Trapping_Rain_Water {
    public static int trapping_Rain_Water(int height[]){
        int n = height.length;
        int width = 1;
        int trappedWater = 0;
        //left max boundry -Array
        int leftMaxBoundry[] = new int[n];
        leftMaxBoundry[0] = height[0];
        for(int i=1; i<n; i++){
            leftMaxBoundry[i] = Math.max(height[i],leftMaxBoundry[i-1]);
        }

        // Right max boundry - Array
        int rightMaxBoundry[] = new int[n];
        rightMaxBoundry[n-1] = height[n-1];
        for(int j=n-2; j>=0; j--){
            rightMaxBoundry[j] = Math.max(height[j], rightMaxBoundry[j+1]);
        }

        for(int k=0; k<n; k++){
            int waterLevel = Math.min(leftMaxBoundry[k],rightMaxBoundry[k]);
            trappedWater += (waterLevel - height[k])*width;
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        //int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int tp = trapping_Rain_Water(height);
        System.out.println("The Trapped Rain Water is : "+tp);

    }
}

//Time Complexcity - O(n)