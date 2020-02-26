package com.Arrays;

import java.util.Scanner;

public class CopyElements {
	public static void main(String[] args) {
		int n=3,m=3;
		int[] arr = new int[n];
		int[] a = new int[m];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			a[i]=arr[i];
		}
		System.out.println("New Array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	
}
