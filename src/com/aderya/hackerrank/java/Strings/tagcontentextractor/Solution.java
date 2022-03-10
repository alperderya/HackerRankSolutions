package com.aderya.hackerrank.java.Strings.tagcontentextractor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){
        String pattern = "<([^<>]+)>([^<>]+)</\\1>";
        Pattern tagExtractor = Pattern.compile(pattern);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            //Write your code here
            Matcher matcher = tagExtractor.matcher(line);
            boolean found = false;
            while(matcher.find()){
                    System.out.println(matcher.group(2));
                    found=true;
            }
            if(!found) System.out.println("None");
            testCases--;
        }
    }
}
