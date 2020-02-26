package com.Arrays;

import java.util.Scanner;

public class SumOfElements {
	public static void main(String[] args) {
		int n=3,i,sum=0;
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
		for(i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of elements in the array:"+sum);
	}
}
