package com.example.user.week1fridaytest;

import java.util.HashMap;

public class Week1TestPart2 {

    public static void main(String[] args) {
        String test1 = "apk";
        String test2 = "Errors in strategy cannot be correct through tactical maneuvers";
        System.out.println(f(test1));
        System.out.println(f(test2));

        String test3 = "Hello there! Apple!";
        System.out.println(g(test3));
    }

    private static String f(String input){
        String result = "";
        for(int i=0; i<input.length(); i++)
        {
            int charInt = input.charAt(i);
            if(charInt >= 97 && charInt <= 122)
            {
                int temp = charInt - 97;
                charInt = 122 - temp;
            }
            result += ((char) charInt);
        }
        return result;
    }

    private static HashMap<Character, Integer> g(String input)
    {
        HashMap<Character, Integer> result = new HashMap<>();
        for(int i=0; i<26; i++)
        {
            result.put((char)(97+i), 0);
        }

        for(int i=0; i<input.length(); i++)
        {
            if(Character.isAlphabetic(input.charAt(i)))
            {
                char lowerC = Character.toLowerCase(input.charAt(i));
                if(result.containsKey(lowerC))
                {
                    result.put(lowerC, result.get(lowerC)+1);
                }
            }
        }

        return result;
    }

}
