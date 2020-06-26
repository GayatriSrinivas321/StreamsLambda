package com.epam.StreamsAndLambda;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;


public class StringsStartWithAandLength3 {
	static List<String> strList = new ArrayList<String>();
    public static List<String> ListOfStrings(List<String> n){
    	 List<String> listStartA = strList.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList());
         List<String> res = listStartA.stream().filter(x -> x.length()== 3).collect(Collectors.toList());
         return res;	
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i < n;i++)
			strList.add(sc.next());
		List<String> ref = ListOfStrings(strList);
          ref.stream().forEach((p) -> System.out.println(p));
	}

}
