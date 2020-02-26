package com.Arrays;

import java.util.Scanner;

public class SeparateEvenOdd {
	public static void main(String[] args) {
		int n=5,m=5,l=5,i;
		int count=0;
		
		int[] arr = new int[n];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements :");
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		sc.close();
		System.out.println("Even elements:");
		for(i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
				
			}
			
		}
		System.out.println("\nOdd elements:");
		for(i=0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
				
			}
			
		}
		
			
	}
}
