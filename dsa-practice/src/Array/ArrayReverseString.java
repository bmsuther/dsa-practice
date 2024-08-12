package Array;

import java.util.Arrays;

public class ArrayReverseString {
    public String reverseString(String str) {
        if(str.isEmpty() || str.length() < 2) {
            return "String must be greater than length of 1 to reverse";
        }

        String[] strArr = str.split("");
        String temp;
        int end = strArr.length - 1;
        for(int i = 0; i < strArr.length / 2; i++) {
            temp = strArr[i];
            strArr[i] = strArr[end];
            strArr[end] = temp;
            end--;
        }
        return String.join("", strArr);
    }
}
