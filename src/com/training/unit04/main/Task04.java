package com.training.unit04.main;

import java.util.Scanner;
import java.util.Random;

public class Task04 {

	public static void main(String[] args) {


		int [] mas= new int [6];
		Random rnd = new Random();
		Scanner sc = new Scanner (System.in);
		int n;
		
		
		
		System.out.println("Исходный код");
		
		for (int i=0; i<mas.length; i++) {
				mas[i]= rnd.nextInt(100);
			
			System.out.printf("Mas["+i+"]"+mas[i]+"; ");
		}
		
		System.out.printf("\nЕсли вы хотите получить сумму позиций массива с 1 по 3, нажмите 1\n"
				+ "Если вы хотите получить сумму позиций массива с 3 по 5, нажмите 2\n"
				+ "Если вы хотите получить сумму позиций массива с 4 по 6, нажмите 3\n");
		
		
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введено некорретное значение");
			
		}
						
		n= sc.nextInt();				
				
		
		if (n==1) {
			
			
			int sum = metod13(mas[0], mas[1], mas[2]);
			System.out.println("Сумма выбранных элементов равна = "+sum);
			
		}else if (n==2) {
			int sum = metod35(mas[2], mas[3], mas[4]);
			System.out.println("Сумма выбранных элементов равна = "+sum);
		}else if (n==3) {
			int sum = metod46(mas[3], mas[4], mas[5]);
			System.out.println("Сумма выбранных элементов равна = "+sum);
		} else if(n>3 | n<=0) {
			
			sc.nextLine();
			System.out.println("Введено некорретное значение N, начни сначала");
							
		}
		
		
	}
	////////////// Сумма 1-3 //////////////////////////
	public static int metod13(int a, int b, int c) {
		
		System.out.println("Суммируем числа = "+a+", "+b+", "+c+".");
		
		int [] mas13= new int [] {a, b, c};
		 int sum=0;
		 
		 for (int i=0; i<mas13.length; i++) {
			 sum=sum+mas13[i];
		 }
		 
		 return sum;
		 
		 
		 
	}
	
	//////////////Сумма 3-5 //////////////////////////
	public static int metod35(int a, int b, int c) {
		
		System.out.println("Суммируем числа = "+a+", "+b+", "+c+".");

			int [] mas35= new int [] {a, b, c};
			int sum=0;

			for (int i=0; i<mas35.length; i++) {
				sum=sum+mas35[i];
			}

			return sum;



	}
	
	//////////////Сумма 4-6 //////////////////////////
	public static int metod46(int a, int b, int c) {

		System.out.println("Суммируем числа = "+a+", "+b+", "+c+".");
		
		int [] mas46= new int [] {a, b, c};
				
		int sum=0;

		for (int i=0; i<mas46.length; i++) {
			sum=sum+mas46[i];
		}

		return sum;


	}

}
