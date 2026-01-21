package com.DSAHighFrequency;

public class BinarySearchRecursion {
    public static int binarySearchR(int[] arr, int target, int l, int r){
        if(l>r){
            return -1;
        }
        int mid = r + ((l-r)/2);
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return binarySearchR(arr, target, l, mid-1);
        }
        return binarySearchR(arr,target,mid+1,r);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 2;
        System.out.println(binarySearchR(arr,target,0, arr.length-1));
        int low = 0;
        int high = arr.length-1;
        while (low<high){
            int mid = low + ((high-low)/2);
            if(arr[mid] == target){
                System.out.println(mid);
                return;
            } else if (arr[mid] > target) {
                high = mid-1;
            }
            else low = mid + 1;
        }

    }

}
