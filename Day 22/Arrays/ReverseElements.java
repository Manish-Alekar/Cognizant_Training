package com.Arrays;

import java.util.Scanner;

public class ReverseElements {
	public static void main(String[] args) {
		int n=3,i;
		int[] arr = new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements :");
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		sc.close();
		System.out.println("Elements entered are:");
		for( i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Reversed elements:");
		for(i=n-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	
			
}
