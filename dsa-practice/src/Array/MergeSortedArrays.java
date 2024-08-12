package Array;

import java.util.Arrays;

public class MergeSortedArrays {
    public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        //check to ensure both arrays have values
        if(arr1.length == 0) {
            return arr2;
        }
        if(arr2.length == 0) {
            return arr1;
        }

        // just to avoid mistakes when inputting the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // start at the beginning of the arrays
        int arr1Tracker = 0;
        int arr2Tracker = 0;
        int currentIndex = 0;

        //create an array with the size of the sum of both inputs
        int[] tempArr = new int[arr1.length + arr2.length];

        //loop while both arrays still have unchecked values
        while(arr1Tracker < arr1.length && arr2Tracker < arr2.length) {
            //if the value in first array is smaller then insert, otherwise insert from the second array
            if(arr1[arr1Tracker] <= arr2[arr2Tracker]) {
                tempArr[currentIndex++] = arr1[arr1Tracker++];
            }
            else {
                tempArr[currentIndex++] = arr2[arr2Tracker++];
            }
        }
        //if array 1 has unchecked values then add to the new array
        while (arr1Tracker < arr1.length) {
            tempArr[currentIndex++] = arr1[arr1Tracker++];
        }
        //if array 2 has unchecked values then add to the new array-
        while (arr2Tracker < arr2.length) {
            tempArr[currentIndex++] = arr2[arr2Tracker++];
        }
        return tempArr;
    }
}
