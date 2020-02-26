package com.Lambda;

public class Calculator {
	public static void main(String[] args) {
		Calc add=(a,b) -> a+b; 
		System.out.println(add.calculate(4, 5));
		
		Calc sub=(a,b) -> a-b;
		System.out.println(sub.calculate(10,5));
		Calc mul=(a,b) -> a*b;
		System.out.println(mul.calculate(2,9));
		Calc div=(a,b) -> a/b;
		System.out.println(div.calculate(30,5));
		Calc mod=(a,b) -> a%b;
		System.out.println(mod.calculate(10,5));
	}
}
@FunctionalInterface
interface Calc{
	double calculate(double a,double b);
}