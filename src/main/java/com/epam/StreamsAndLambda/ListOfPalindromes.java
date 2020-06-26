package com.epam.StreamsAndLambda;

import java.util.ArrayList;
import java.util.List;


import java.util.Arrays;

public class ListOfPalindromes {
    public static List<String> palindromes = Arrays.asList(
            "Madam",
            "Flee",
            "12321",
            "Asasa"
    );

    public static List<String> isPalindromeUsingLambda(){
    	List<String> res = new ArrayList<String>();
        palindromes.forEach(s -> {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    sb.append(c);
                }
            }
            String forward = sb.toString().toLowerCase();
            String backward = sb.reverse().toString().toLowerCase();
            if(forward.equals(backward)) {
            	res.add(s);
            }
        });
        return res;
    }
    
    public static void main(String[] args) {
    	List<String> res = isPalindromeUsingLambda();
    	res.stream().forEach((p) -> System.out.println(p));
    }
}