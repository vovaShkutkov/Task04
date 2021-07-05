package com.training.unit04.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
				
		System.out.printf("Введите первое число>");
		
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введено некорретное значение");
			
		}
		
		a = sc.nextInt();
		
		System.out.printf("Введите второе число>");
		
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введено некорретное значение");
			
		}
		
		b = sc.nextInt();
		
		System.out.printf("Введите третье число>");
		
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введено некорретное значение");
			
		}
		
		c = sc.nextInt();
		
		
		
		method (a,b,c);
		
		
	}
	
	private static void method(int a1, int b1, int c1) {
	
		int max=0;
		int min=0;
		int sum;
		
		///////находим максимальное значение////////
	
		if (a1>=b1) { 
			max=a1;
		}else {
			max=b1;
		}
		if (c1>=max) {
			max=c1;
		}
		
	///////находим минимальное значение////////
		
			if (a1>=b1) { 
				min=b1;
			}else {
				min=a1;
			}
			if (c1<=min) {
				min=c1;
			}
		
			sum = min+max;
			
			System.out.println("Максимальное знач. = "+max +"\nМинимальное знач."+min);
			
			System.out.println("Сумма минимального и максимального значений равна = "+sum);
		
	}

}