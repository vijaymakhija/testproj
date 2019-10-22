package com.optum;

import java.util.Arrays;

/*Time Complexity: O(n2) as there are two nested loops.
Auxiliary Space: O(1)
The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a 
costly operation.
In-place
*/
public class SelectionSort {

	public static void main(String[] args) {
		//64 25 12 22 11
		//11 25 12 22 64
		//11 12 25 22 64
		int[] arr = new int[]{64,25,12,22,11};
		int len = arr.length;
		for(int i=0;i<len-1;i++){
			int minIndx = i;
			for(int j=i+1;j<len;j++){
				if(arr[minIndx] > arr[j]){
					minIndx = j;					
				}
			}
			int tmp = arr[i];
			arr[i] = arr[minIndx];
			arr[minIndx] = tmp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
