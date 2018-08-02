package com.capgemini.streans.perform_integer_operations;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PerformIntegerOperations {

	public static void main(String[] args) {
	
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1;i<=100;i++)
		{
			//Adding Random Number in ArrayList
			list.add((int)(Math.random()*10000)%100);
		}
		Consumer<Integer> Print=System.out::println;
		
		//Using Predicate Performing Integer Operations
		Predicate<Integer> Even=(element)->(element%2==0)?true:false;
		Predicate<Integer> Odd=(element)->(element%2==0)?false:true;	
		Predicate<Integer> Dividebysix=(element)->(element%6==0)?true:false;
		Predicate<Integer> LessThanTwelve=(element)->(element<12)?true:false;
		Predicate<Integer> GreaterThanFifty=(element)->(element>50)?true:false;
		
		System.out.println("1. All integers in the list");
		list.stream().forEach(Print);
		
		System.out.println("2. All even elements in the list");
		list.stream().filter(Even).forEach(Print);
		
		System.out.println("3. All odd elements in the list");
		list.stream().filter(Odd).forEach(Print);
		
		System.out.println("4. All numbers divisible by 6 in the list");
		list.stream().filter(Dividebysix).forEach(Print);
		
		System.out.println("5. All numbers less than 12 in the list");
		list.stream().filter(LessThanTwelve).forEach(Print);
		
		System.out.println("6. All numbers greater than 50 in the list");
		list.stream().filter(GreaterThanFifty).forEach(Print);
			
	}

}
