package com.aderya.hackerrank.java.stringtokens;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.trim();
        String[] tokens = s.split("[ ,?'!@_.]+");
        if(s.length() == 0){
            System.out.println(0);
            return;
        }
        System.out.println(tokens.length);
        Arrays.stream(tokens).forEach(System.out::println);
    }
}
