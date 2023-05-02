package org.example;

public class SumCalculator {
    int sum(int n){
        if(n == 0){
            throw new IllegalArgumentException("Number is smaller..");
        }
        int result = 0;
        for(int i = 0; i <= n; i++){
            result += i;
        }
        return result;
    }
}