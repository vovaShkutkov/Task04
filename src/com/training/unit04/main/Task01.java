package com.training.unit04.main;

import java.util.Scanner;

public class Task01 {

	

	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner ent = new Scanner (System.in);
		
		System.out.printf("Введите [A]>");
		
		while(!ent.hasNextInt()) {
			ent.nextLine();
			System.out.println("Введено некорретное значение");
			
		}
		
		a = ent.nextInt();
		
		System.out.printf("Введите [B]>");
		
			while(!ent.hasNextInt()) {
				ent.nextLine();
				System.out.println("Введено некорретное значение");
			
			}
		
		b = ent.nextInt();
		
		int NOD = nod(a,b);
		
		System.out.println("НОД="+NOD);
		
		int NOK= nok(a, b,NOD);
		
		System.out.println("НОК="+NOK);
		
	}
	
	public static int nod( int x, int y) {
		
		
		if (x == 0) return y;

	    if (y == 0) return x;

	    if (x >= y) return nod(x % y, y);

	    return nod(x, y % x);	
	}
	
	public static int nok( int x, int y, int z) {
		
		int nok= (x*y)/z;
		return nok;
	}
	
}