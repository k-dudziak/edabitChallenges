package org.test;

public class PronicNumber {

    public static boolean isHeteromecic(int n) {
        boolean isPronic = false;
        for (int i = 0; i <= n; i++) {
            if(i*(i+1) == n){
                isPronic = true;
            } else if(i*(i+1) > n){
                break;
            }
        }
        return isPronic;
    }
}
