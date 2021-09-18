package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static boolean isAnagrama(String word1 , String word2){
       if(word1.length() != word2.length()){
           return false;
       }
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]){
                return false;
            }
        }
        return true;
    }

    public static Map<Character , Integer> stringToMap(String word){
        Map<Character , Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            Character letter = word.charAt(i);
            if (map.containsKey(letter)){
                int value = map.get(letter);
                map.put(letter , value+1);
            }
            else{
                map.put(letter , 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        //увидимся удивимся
        Map<Character , Integer> map= stringToMap("пррривіт");
        System.out.println(map);

        System.out.println(isAnagrama("годо", "догг"));
    }
}
