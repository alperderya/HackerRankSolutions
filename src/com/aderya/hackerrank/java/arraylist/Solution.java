package com.aderya.hackerrank.java.arraylist;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String[]> listOfArray = new ArrayList<>();
        while(n-->0){
            String line = scanner.nextLine();
            listOfArray.add(line.split(" "));
        }
        int q = Integer.parseInt(scanner.nextLine());
        while(q-->0){
            try{
                String line = scanner.nextLine();
                String[] xy = line.split(" ");
                System.out.println(listOfArray.get(Integer.parseInt(xy[0])-1)[Integer.parseInt(xy[1])]);
            }catch(Exception e){
                System.out.println("ERROR!");
            }

        }
    }
}
