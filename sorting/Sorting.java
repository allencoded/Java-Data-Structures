import java.util.ArrayList;
import java.util.List;

//***********************************************************************************
//  Sorting.java
//
//  Contains various sort algorithms that operate on an array of comparable objects.
//
//************************************************************************************

public class Sorting

{

//------------------------------------------------------------------------------------
//  Sorts the specified array of integers using the selection sort algorithm.
//------------------------------------------------------------------------------------
	public static void main(String[] args){
		long start, end;
		start = System.nanoTime();
		double difference;
		
		String[] Comparable = new String[35];
		Comparable[0] = "Allen";
		Comparable[1] = "John";
		Comparable[2] = "Rick";
		Comparable[3] = "Zimbawe";
		Comparable[4] = "Roger";
		Comparable[5] = "Jim";
		Comparable[6] = "Felix";
		Comparable[7] = "Gary";
		Comparable[8] = "Ed";
		Comparable[9] = "Mark";
		Comparable[10] = "Paul";
		Comparable[11] = "Zack";
		Comparable[12] = "Alice";
		Comparable[13] = "Criss";
		Comparable[14] = "Polo";
		Comparable[15] = "Peter";
		Comparable[16] = "Kandice";
		Comparable[17] = "Matt";
		Comparable[18] = "Andy";
		Comparable[19] = "Helena";
		Comparable[20] = "Andrea";
		Comparable[21] = "Michael";
		Comparable[22] = "Doris";
		Comparable[23] = "John";
		Comparable[24] = "George";
		Comparable[25] = "Richard";
		Comparable[26] = "Abraham";
		Comparable[27] = "Bill";
		Comparable[28] = "Bobby";
		Comparable[29] = "Beekman";
		Comparable[30] = "Luke";
		Comparable[31] = "Chewie";
		Comparable[32] = "Han";
		Comparable[33] = "Yoda";
		Comparable[34] = "Laya";
		
		
		
		start = System.nanoTime();
		selectionSort(Comparable);
		end = System.nanoTime();
		difference = end-start;
		System.out.println(difference+"= selection sort");
		
		
		start = System.nanoTime();
		swap(Comparable, 1, 2);
		end = System.nanoTime();
		difference = end-start;
		System.out.println(difference+"= Swap Sort");
		
		
		start = System.nanoTime();
		insertionSort(Comparable);
		end = System.nanoTime();
		difference = end-start;
		System.out.println(difference+"= insertion sort");
		
		
		start = System.nanoTime();
		bubbleSort(Comparable);
		end = System.nanoTime();
		difference = end-start;
		System.out.println(difference+"= bubble sort");
	
		
		start = System.nanoTime();
		quickSort(Comparable, 1, 34);
		partition(Comparable,1, 34);
		end = System.nanoTime();
		difference = end-start;
		System.out.println(difference+"= quick sort");
		
		
		start = System.nanoTime();
		mergeSort(Comparable, 1, 34);
		merge(Comparable, 1, 17, 34);
		end = System.nanoTime();
		difference = end-start;
		System.out.println(difference+"= merge sort");
		
	}
	
	
	
	
public static void selectionSort (Comparable[] data)
{
  int min;
  
  for (int index = 0; index < data.length-1; index ++)
  {
     min = index;
	  for (int scan = index+1; scan < data.length; scan++)
	    if (data[scan].compareTo(data[min]) < 0)
		    min = scan;
			 
	  swap (data, min, index);
  
  }
}
//---------------------------------------------------------------------------------------
//  Swaps to elements in the specified array.
//---------------------------------------------------------------------------------------

private static void swap (Comparable[] data, int index1, int index2)
{
   Comparable temp = data[index1];
	data[index1] = data[index2];
	data[index2] = temp;

}

//---------------------------------------------------------------------------------------
//  Sorts the specified array of objects using an insertion sort algorithm.
//---------------------------------------------------------------------------------------

public static void insertionSort (Comparable[] data)
{
  for (int index = 1; index < data.length; index++)
  {
    Comparable key = data[index];
	 int position = index;
	 
	 // shift larger values to the right
	 while (position > 0 && data[position-1].compareTo(key) > 0)
	 {
	   data[position] = data[position-1];
		position--;
	 }
	 
	 data[position] = key;
	 
	}
  
}

//---------------------------------------------------------------------------------------
//  Sorts the specified array of objects using a bubble sort algorithm.
//---------------------------------------------------------------------------------------

public static void bubbleSort (Comparable[] data)
{
  int position, scan;
  
  for (position = data.length - 1; position >= 0; position--)
  {
  	 for (scan = 0; scan <= position - 1; scan ++)
	   if (data[scan].compareTo(data[scan+1]) >0)
		  swap (data, scan, scan+1);
	 
	}
}

//---------------------------------------------------------------------------------------
//  Sorts the specified array of objects using the quick sort algorithm.
//---------------------------------------------------------------------------------------

public static void quickSort (Comparable[] data, int min, int max)
{
  int pivot;
  
  if (min < max)
  {
    pivot = partition (data, min, max); // make partitions
	 quickSort(data, min, pivot-1);  //sort left paritions
	 quickSort(data, pivot+1, max);  //sort right paritions
  }
}
//---------------------------------------------------------------------------------------
//  Creates the partitions needed for quick sort.
//---------------------------------------------------------------------------------------

public static int partition (Comparable[] data, int min, int max)
{
  //Use first element as the partition value
  Comparable partitionValue = data[min];
  
  int left = min;
  int right = max;
  
  while (left < right)
  {
    // Search for an element that is greater than the partition element
	 while (data[left].compareTo(partitionValue) <= 0 && left < right)
	   left++;
		
	// Search for an element that is less than the partition element
	while (data[right].compareTo(partitionValue) > 0)
	  right--;
	  
	if (left < right)
	  swap (data, left, right);
	  
	}
	
	// Move the partition element to its final position
	swap (data, min, right);
	
	return right; 
  }
  
//---------------------------------------------------------------------------------------
//  Sorts the specified array of objects using the merge sort algorithm.
//---------------------------------------------------------------------------------------

public static void mergeSort (Comparable[] data, int min, int max)
{
  if (min < max)
  {
    int mid = (min + max) / 2;
	 mergeSort(data, min, mid);
	 mergeSort(data, mid+1, max);
	 merge (data, min, mid, max);
	 
  }
 }

//---------------------------------------------------------------------------------------
//  Sorts the specified array of objects using the merge sort algorithm.
//---------------------------------------------------------------------------------------

public static void merge (Comparable[] data, int first, int mid, int last)
{
  Comparable[] temp = new Comparable[data.length];
  
  int first1 = first, last1 = mid; //endpoints of first subarray
  int first2 = mid + 1, last2 = last; //endpoints of second subarray
  int index = first1; // next index open in temp array
  
  // Copy smaller item from each subarry into temp until one of the subarrays is exhausted
  
  while (first1 <= last1 && first2 <= last2)
  {
    if (data[first1].compareTo(data[first2]) < 0)
	 {
	   temp[index] = data[first1];
		first1++;
	 }
	 else
	 {
	   temp[index] = data[first2];
		first2++;
	 }
	index++;
  }
 //  Copy remaining elements from first subarray, if any
 while (first1 <= last1)
 {
   temp[index] = data[first1];
	first1++;
	index++;
 }
 
 //  Copy remaining elements from second subarray, if any
 while (first2 <= last2)
 {
   temp[index] = data[first2];
	first2++;
	index++;
 }
 
 // Copy merged data into original array
 for (index = first; index <= last; index++)
   data[index] = temp[index];
 }
 }