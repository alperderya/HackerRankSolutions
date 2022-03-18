package com.aderya.hackerrank.java.DataStructures.javalist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        List<Integer> intList = new ArrayList<>();
        while(length-->0){
            intList.add(scanner.nextInt());
        }
        int numQueries = scanner.nextInt();
        while(numQueries-->0){
            String command = scanner.next();
            if(command.equalsIgnoreCase("Insert")){
                intList.add(scanner.nextInt(), scanner.nextInt());
            }else if(command.equalsIgnoreCase("Delete")){
                intList.remove(scanner.nextInt());
            }
        }

        intList.forEach(x-> System.out.print(x + " "));
    }
}
