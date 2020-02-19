/*Consider the following unsorted list
    Neena Meeta Geeta Reeta Seeta
    Sort the list using selection sort algorithm. Show the status of the list after every iteration.*/
public class SelectionSort {
	public static void selectionSort( String[] array )
	  {
		for ( int j=0; j < array.length-1; j++ )
	    {
			int min = j;
		      for ( int k=j+1; k < array.length; k++ ) {
		        if ( array[k].compareTo( array[min] ) < 0 ) 
		        	min = k;  
		      }
		      String temp = array[j];
		      array[j] = array[min];
		      array[min] = temp;
	    }
		
	  }	
	public static void main(String...args) {
		String array[]= {"Neena" ,"Meeta" ,"Geeta" ,"Reeta", "Seeta"};
		selectionSort(array);
		for(String i:array)
		{
		System.out.println(i);
		}
	}
}
