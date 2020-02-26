package com.Arrays;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		int n=3,i;
		int count=0;
		
		int[] arr = new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements :");
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		sc.close();
		int max=arr[0];
		for(i=1;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		
		}
		System.out.println("Maximum value:"+max);
		int min=arr[0];
		for(i=1;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		
		}
		System.out.println("Minimum value:"+min);
	}
}
