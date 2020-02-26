package com.Arrays;

import java.util.Scanner;

public class MatrixOperation {
	public static void main(String[] args) {
		
		 int arr[][] = {     
                 {1, 2, 3},  
                 {4, 5, 6},  
                 {7, 8, 9}  
             };  
		MatrixOperation mo = new MatrixOperation();
		mo.sumRows(arr);
		mo.sumCols(arr);
		mo.sumLeftDiagonal(arr);
		mo.Divisible(arr);
	}	
		public void sumRows(int[][] arr)
		{
			
			for(int i=0;i<3;i++)
			{
				int sum=0;
				for(int j=0;j<3;j++)
				{
					
					
					sum = sum+arr[i][j];
				}
				
				System.out.println("Sum of "+(i+1)+" rows: "+sum);
			}
		}
		public void sumCols(int[][] arr)
		{
			for(int i=0;i<3;i++)
			{
				int sum=0;
				for(int j=0;j<3;j++)
				{
					
					sum = sum+arr[j][i];
				}
				
				System.out.println("Sum of "+(i+1)+" columns: "+sum);
			}
		}
		public void sumLeftDiagonal(int[][] arr)
		{
			int sum=0;
			for(int i=0;i<3;i++)
		    { 
				
				for(int j=0;j<3;j++)
				{ 
					if(i==j) 
					{
						sum = sum + arr[i][j];
					}
				}
				
		    }
			System.out.println("Sum of diagonal elements of the matrix = "+sum) ; 
		}
		public void Divisible(int[][] arr )
		{
			int sum=0;
			for(int i=0;i<3;i++)
			{
				
				for(int j=0;j<3;j++)
				{
					if(arr[i][j]%2==0 || arr[i][j]%3==0)
					{
						sum=sum+arr[i][j];
					
					}
				}
				
				
			}
			System.out.println("Sum of elements which are divisible by 2 and 3 : "+sum);
		}
		
	
}
