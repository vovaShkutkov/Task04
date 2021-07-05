package com.training.unit04.main;

import java.util.Random;

public class Task03 {

public static void main(String[] args) {
		
		Random rnd= new Random();
		int first;
		int second;
		
		first = rnd.nextInt(100);
		second = rnd.nextInt(100);

		System.out.println("Сравневыемые числа "+first+" и "+second);
		
		compare(first, second);
		
		

	}
	
	public static void compare(int x, int y) {
		
		int total;
		int count1=0;
		int count2=0;
		
		String str1 = x+"";
		String str2 = y+"";
		
		for (int i=0; i<str1.length(); i++) {
			count1++;
			
		}
		
		for (int i=0; i<str2.length(); i++) {
			count2++;
			
		}
		
		System.out.printf("В первой цифре "+ count1+ " символа\n");
		System.out.printf("Во второй цифре "+ count2+ " символа\n");
		
		if (count1>count2) {
			total=x;
			System.out.println("В числе "+total+" больше символов");
		}else if (count1<count2) { 
			total=y;
			System.out.println("В числе "+total+" больше символов");
		
		}else if (count1==count2) {
		
			System.out.println("Числа "+x+" и "+y+" равны");
		}
		
	}

}