package com.aderya.hackerrank.java.Strings.anagrams;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String myFirstString = scanner.next().toLowerCase();
        String mySecondString = scanner.next().toLowerCase();

        Map<Character, Integer> charMap = new HashMap<>();
        myFirstString.chars().mapToObj(c-> (char) c).forEach(x->{
            if(charMap.get(x) == null){
                charMap.put(x, 1);
            }else{
                int k = charMap.get(x);
                k++;
                charMap.put(x, k);
            }
        });

        for(int k=0; k<mySecondString.length(); k++){
            char letter = mySecondString.charAt(k);
            if(charMap.get(letter) == null || charMap.get(letter) == 0)
            {
                System.out.println("Not Anagrams");
                return;
            }

            int intValue = charMap.get(letter);
            intValue--;
            charMap.put(letter,intValue);
        }


        Optional<Integer> max = charMap.values().stream().max(Comparator.naturalOrder());
        if(max.get()>0){
            System.out.println("Not Anagrams");
        }else{
            System.out.println("Anagrams");
        }
    }
}

