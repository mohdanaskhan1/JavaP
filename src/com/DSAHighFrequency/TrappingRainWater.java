package com.DSAHighFrequency;

public class TrappingRainWater {
    public static int trap(int[] height) {
//        int n = height.length;
//        int[] leftMax = new int[n];
//        int[] rightMax = new int[n];
//        leftMax[0] = height[0];
//        for(int i=1; i<n; i++){
//            leftMax[i] = Math.max(leftMax[i-1],height[i]);
//        }
//        rightMax[n-1] = height[n-1];
//        for(int i=n-2; i>0; i--) {
//            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
//        }
//        int water=0;
//        for(int i=1; i<n-1; i++){
//            water = water + Math.min(rightMax[i],leftMax[i])-height[i];
//        }
//        return water;


        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxLeft = 0;
        int maxRight = 0;
        int water = 0;
        while (left < right){
            maxLeft = Math.max(maxLeft, height[left]);
            maxRight = Math.max(maxRight, height[right]);
            if(maxLeft<maxRight){
                water += maxLeft-height[left];
                left++;
            }
            else {
                water += maxRight-height[right];
                right--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
