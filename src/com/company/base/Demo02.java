package com.company.base;

public class Demo02 {
    public static void main(String[] args) {

        int [] arr = {2,3,5,12,34,56,67};
         int index = binarySearch(arr,5);

    }
    static int binarySearch(int[] arr,int item){
        int low = 0;
        int high =arr.length -1;
        int index = -1;

        while(low <= high){
            int mid = (low +high)/2;
            int guess = arr[mid];
            if (guess == item) {
                index = mid;
            }
            if (guess > item) {
                high = mid - 1;
            }
            if (guess < item) {
                low = mid + 1;
            }
        }


        return index;
        }





}
