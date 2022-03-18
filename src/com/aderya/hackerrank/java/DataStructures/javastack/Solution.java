package com.aderya.hackerrank.java.DataStructures.javastack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {

        Map<Character, Character> charMap = new HashMap<>();
        charMap.put('}', '{');
        charMap.put(']', '[');
        charMap.put(')', '(');

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            Stack<Character> stk = new Stack<>();
            String input=sc.next();
            input.chars().forEach(x-> {
                if(stk.empty())
                    stk.push((char)x);
                else {
                    Character mappedChar = charMap.get((char)x);
                    if(mappedChar==null || stk.peek().compareTo(mappedChar) != 0) {
                        stk.push((char)x);
                    }else{
                        stk.pop();
                    }

                }
            });
            System.out.println(stk.isEmpty());
        }
    }
}
