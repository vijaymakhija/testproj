package com.optum;

import java.util.Arrays;

public class BubbleSort {
	/*Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
	Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
	Auxiliary Space: O(1)
	Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
	Sorting In Place: Yes
	Stable: Yes*/
	public static void main(String[] args) {
		//( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ),
		//( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ),
		//( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 )
		//( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
		int[] arr = new int[]{8,2,4,1,1};
		int len = arr.length;
		for(int i=0;i<len-1;i++){
			boolean sorted = true;
			for(int j=i+1;j<len;j++){
				if(arr[i] > arr[j]){
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
					sorted = false;
				}
			}
			if(sorted)
				break;
		}
		System.out.println(Arrays.toString(arr));
	}
}
