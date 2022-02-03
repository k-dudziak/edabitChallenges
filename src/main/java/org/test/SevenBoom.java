package org.test;

public class SevenBoom {

    // Returns (and prints) "Boom!" if there is digit 7 in any element of the array
    public static String sevenBoom(int[] arr) {
        String message = "there is no 7 in the array";
        for (int i = 0; i < arr.length; i++) {
            if(String.valueOf(arr[i]).contains("7")){
                message = "Boom!";
                break;
            }
        }
        System.out.println(message);
        return message;
    }
}
