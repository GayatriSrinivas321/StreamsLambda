package com.epam.StreamsAndLambda;
import java.util.*;
public class AverageOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] ar = new int[n];
       for(int i = 0;i < n;i++) {
    	   ar[i] = sc.nextInt();
       }
       System.out.print((Arrays.stream(ar).sum())/ar.length);
	}

}
