package com.aderya.hackerrank.java.BigNumber.bigdecimal;

import java.math.BigDecimal;
import java.util.*;

class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        boolean isIterationEnd = false;
        while(!isIterationEnd){
            isIterationEnd = true;
            for(int i=0; i<n-1; i++){
                BigDecimal first = new BigDecimal(s[i]);
                BigDecimal second = new BigDecimal(s[i+1]);
                if(second.compareTo(first)==1){
                    //swap strings
                    String temp = s[i];
                    s[i] = s[i+1];
                    s[i+1] = temp;
                    isIterationEnd = false;
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
