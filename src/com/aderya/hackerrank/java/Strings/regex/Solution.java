package com.aderya.hackerrank.java.Strings.regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();
        while(scanner.hasNextLine()){
            inputList.add(scanner.nextLine());
        }

        MyRegex myRegex = new MyRegex();
        inputList.forEach(x-> System.out.println(myRegex.isIPAddress(x)));

    }

    public static class MyRegex {
        String pattern = "^((0[0-9]{1,2}|[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";

        public boolean isIPAddress(String ipAddress){

            Pattern p = Pattern.compile(this.pattern);
            Matcher m = p.matcher(ipAddress);
            return m.matches();
        }
    }
}

