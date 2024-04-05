package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can pu the quadratics into a form that can be factored allowing that side of the equation to equal zero. Oce you've done that, it's pretty straightforward from there.";

        char[] charArray = quote.toCharArray();

        HashMap<Character, Integer> Counts = new HashMap<>();

        for(char letter : charArray) {
          if (Counts.containsKey(letter)) {
            Counts.put(letter, Counts.get(letter) + 1);
          } else {
            Counts.put(letter, 1);
          }
        }
        
        for (Map.Entry<Character, Integer> count : Counts.entrySet()) {
          System.out.println(count.getKey() + " : " + count.getValue());
        }
    }
}
