package com.Arrays;

import java.util.Scanner;

public class CountDuplicate {
	public static void main(String[] args) {
		int n=5,i;
		int count=0;
		int[] arr = new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements :");
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		sc.close();
		for(i=0;i<n-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;
			}
		
		}
		System.out.println("Duplicate elements :" +count);
		
	}
}
