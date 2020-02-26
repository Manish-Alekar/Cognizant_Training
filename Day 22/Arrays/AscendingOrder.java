package com.Arrays;

import java.util.Scanner;

public class AscendingOrder {
	public static void main(String[] args) {
		int n=3,i,temp;
		int[] arr = new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements :");
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		sc.close();
		for( i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }   
		}
			System.out.println("Sorted array:");
			for(i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}
	
	}
}
