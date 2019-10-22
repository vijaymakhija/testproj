package com.optum;

import java.util.Arrays;
/* Time Complexity: O(n*2)

Auxiliary Space: O(1)

Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order.
And it takes minimum time (Order of n) when elements are already sorted.

Algorithmic Paradigm: Incremental Approach

Sorting In Place: Yes

Stable: Yes*/
public class InsertionSort {

	public static void main(String[] args) {
		//12, 11, 13, 5, 6
		//11, 12, 13, 5, 6
		//11, 12, 13, 5, 6
		//5, 11, 12, 13, 6
		//5, 6, 11, 12, 13
		int arr[] = new int[]{12,11,13,5,6};
		int len = arr.length;
		for(int i=1;i<len;i++){
			int key = arr[i];//5
			int j = i-1;//1
			while(j >= 0 && key < arr[j]){
				arr[j+1] = arr[j]; 
				j--;
			}
			arr[j+1] = key;
		}
		System.out.println(Arrays.toString(arr));
	}

}
