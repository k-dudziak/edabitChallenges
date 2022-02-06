package org.test;

public class HowMuchIsTrue {
    public static int countTrue(boolean[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == true){
                count = count+1;
            }
        }
        return count;
    }
}