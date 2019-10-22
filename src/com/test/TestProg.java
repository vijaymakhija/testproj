package com.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class TestProg {

	public static void main(String[] args) {
		//printTriangle();
		//numberOfDigits();
		//fibonacci();
		/*binaryGap(5);
		binaryGap(9);
		binaryGap(15);
		binaryGap(32);
		binaryGap(529);*/
		/*cyclicRotation(new int[]{3, 8, 9, 7, 6},3);
		cyclicRotationInplace(new int[]{3, 8, 9, 7, 6},3);
		cyclicRotation(new int[]{3, 8, 9},5);
		cyclicRotationInplace(new int[]{3, 8, 9},5);
		cyclicRotation(new int[]{1,2},1001);
		cyclicRotationInplace(new int[]{1,2},1001);
		cyclicRotation(new int[]{1,2,3,4,5,6},2);
		cyclicRotationInplace(new int[]{1,2,3,4,5,6},2);*/
		/*System.out.println(frogJump(10, 85, 30));
		System.out.println(frogJump(10, 30, 30));
		System.out.println(frogJump(10, 40, 30));
		System.out.println(frogJump(0, 40, 30));
		System.out.println(frogJump(0, 1000000000, 30));
		System.out.println(frogJump(10, 30, 10));
		System.out.println(frogJump(10, 30, 100));*/
		
		
		//System.out.println(findMissingElem(new int[]{2,3,1,5}));
		//System.out.println(findMissingElem(new int[]{2}));
		//System.out.println(findMissingElem(new int[]{}));
	/*	System.out.println(tapeEqui(new int[]{5,1,2,4,3}));
		System.out.println(tapeEqui(new int[]{2,4}));
		System.out.println(tapeEqui(new int[]{5,5,5,5}));
		
		System.out.println(tapeEqui1(new int[]{5,1,2,4,3}));
		System.out.println(tapeEqui1(new int[]{2,4}));
		System.out.println(tapeEqui1(new int[]{5,5,5,5}));
		reverseRotation(new int[]{1, 2, 3, 4, 5, 6, 7}, 2);
		reverseRotation(new int[]{1, 2, 3}, 4);
		reverseRotation(new int[]{1, 2, 3, 4, 5, 6, 7}, 4);
		reverseRotation(new int[]{1, 2}, 1001);*/
		//System.out.println(printOdd1(new int[]{9,3,9,3,9,7,9,7,5}));
		/*System.out.println(buySellStock(new int[]{7,1,5,8,9,4}));
		System.out.println(buySellStock(new int[]{1,2,3,4,5,6}));*/
		//System.out.println(removeDuplicatesInPlace(new int[]{1,1,2}));;
		//findSwapValues(new int[]{4, 1, 2, 1, 1, 2 }, new int[]{3, 6, 3, 3 });
		/*System.out.println(frogRiver(5,new int[]{1,3,1,4,2,3,5,4}));;
		System.out.println(frogRiver(1,new int[]{1,3,1,4,2,3,5,4}));;
		System.out.println(frogRiver(6,new int[]{1,3,1,4,2,3,5,6}));;*/
		System.out.println(numOfIntersections1(new int[]{1, 5, 2, 1, 4, 0}));
		System.out.println("2019 test.pdf".split("\\.")[0]) ;
	}
	
	public static void printTriangle(){
		int n = 5;
		
		for(int i = n; i>0;i--){
			for(int k = 0;k<n-i;k++){
				System.out.print(" ");								
			}
			for(int l = 0;l<2*i-1;l++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void numberOfDigits(){
		int n = 153406596;
		int cnt = 0;
		while(n > 0){
			n = n/10;
			cnt++;
		}
		System.out.println(cnt);
	}
	
	public static void fibonacci(){
		
		int a = 0;
		int b = 1;
		int c = a+b;
		int n = 15;
		System.out.println("-------------------");
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		while(c < n){
			System.out.println(c);
			a = b;
			b = c;
			c = a+b;
			
		}
		
	}
	
	public static void binaryGap(int n){
		String s = Integer.toBinaryString(n);
		System.out.println(s);
		int len = s.length();
		int gapStart = 0;
		int maxGap = 0;
		for(int i=0;i<len;i++){
			if(s.charAt(i) == '1'){
				int tmpGap = i-gapStart-1;
				if(tmpGap > maxGap)
					maxGap = tmpGap;
				gapStart = i;
			}
		}
		System.out.println(maxGap);
	}
	
	public static int printOdd(int[] A ){
		for(int i=0;i<A.length;i++){
			boolean matched = false;
			for(int j=0;j<A.length;j++){
				if(i != j && A[i] == A[j]){
					matched = true;
					break;
				}
			}
			if(matched == false)
				return A[i];
		}
		
		return 0;
	}
	
	public static int printOdd1(int[] A ){
		int i; 
        int res = 0; 
        for (i = 0; i < A.length; i++)  
        { 
            res = res ^ A[i]; 
        } 
        return res; 
	}
	
	public static int[] cyclicRotation(int[] A, int K){
		int len = A.length;
		int[] tmpA = new int[len];
		for(int i=0;i<len;i++){
			int tmpK = K;
			if(K>len)
				tmpK = K%len;
			
			if(i+tmpK<len)
				tmpA[i+tmpK] = A[i];
			
			if(i+tmpK>=len){				
				tmpA[tmpK-(len-1-i)-1] = A[i];
			}
				
		}
		System.out.println(Arrays.toString(tmpA));
		return tmpA;
	}
	
	public static int[] reverseRotation(int[] A, int K){
		/*Input :  arr[] = [1, 2, 3, 4, 5, 6, 7]
		 * [4, 5, 6, 7, 1, 2, 3]
		         d = 3
		Output : arr[] = [3, 4, 5, 6, 7, 1, 2] */
		int len = A.length;
		int[] tmpA = new int[len];
		for(int i=0;i<len;i++){
			int tmpK = K;
			if(K>len)
				tmpK = K%len;
			
			if(i-tmpK>=0)
				tmpA[i-tmpK] = A[i];
			
			if(i-tmpK<0){
				tmpA[len+(i - tmpK)] = A[i];
			}
				
		}
		System.out.println(Arrays.toString(tmpA));
		return A;
	}
	
	public static int findMissingElem(int[] A){
		int n = A.length;
		int i, total=1;
		for ( i = 2; i<= (n+1); i++) 
	    { 
	        total+=i; 
	        total -= A[i-2]; 
	    } 
        return total; 
	}
	
	public static int tapeEqui(int[] A){
		int diff = -1;
		int sum1 = 0;		
		int len = A.length;
		for(int i=1;i<len;i++){
			int sum2 = 0;
			sum1 = sum1 + A[i-1];
			for(int j=i;j<len;j++){
				sum2 = sum2 + A[j];
			}
			int tmpDiff = Math.abs(sum2 - sum1);
			if(diff == -1 || tmpDiff < diff)
				diff = tmpDiff;
		}
		return diff;
	}
	
	public static int tapeEqui1(int[] A){
		int diff = -1;
		int sum1 = 0;		
		int sum2 = 0;
		int len = A.length;
		for(int i=0;i<len;i++){			
			sum1 = sum1 + A[i];			
		}
		
		for(int j=0;j<len;j++){
			sum1 = sum1 - A[j];
			sum2 = sum2 + A[j];
			int tmpDiff = Math.abs(sum2 - sum1);
			if(diff == -1 || tmpDiff < diff)
				diff = tmpDiff;
		}
		
		
		return diff;
	}
	
	public static int buySellStock(int[] prices ){
		/*Input: [7,1,5,8,6,9]
				Output: 7*/
		int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
	}
	
	public static int removeDuplicatesInPlace(int[] nums ){
		if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    System.out.println(i+1);
	    for(int k=0;k<nums.length;k++){
	    	System.out.print(" - "+nums[k]);
	    }
	    return i + 1;
	}
	
	public static void cyclicRotationInplace(int[] nums, int k){
		 int[] a = new int[nums.length];
	        for (int i = 0; i < nums.length; i++) {
	            a[(i + k) % nums.length] = nums[i];
	        }
	        for (int i = 0; i < nums.length; i++) {
	            nums[i] = a[i];
	        }
		
		System.out.println(Arrays.toString(nums));
		
	}
	
	public static int frogJump(int X, int Y, int D){
		int jumps = 0;
		int dist = Y-X;
		if(dist == 0)
			return 0;
		if(dist > D){
			int diff = (Y-X)%D;
			jumps = (Y-X)/D;
			if(diff > 0)
				jumps++;
		}else
			jumps = 1;
		return jumps;
	}
	
	static int getSum(int X[], int n) 
    { 
        int sum = 0; 
        for (int i = 0; i < n; i++) 
            sum += X[i]; 
        return sum; 
    } 
      
    // Function to calculate : a - b = (sumA - sumB) / 2 
    static int getTarget(int A[], int n, int B[], int m) 
    { 
        // Calculation of sums from both arrays 
        int sum1 = getSum(A, n); 
        int sum2 = getSum(B, m); 
   
        // because that the target must be an integer 
        if ((sum1 - sum2) % 2 != 0) 
            return 0; 
        return ((sum1 - sum2) / 2); 
    } 
      
    // Function to prints elements to be swapped 
    static void findSwapValues(int A[], int B[]) 
    { 
    	int n = A.length;
    	int m = B.length;
        // Call for sorting the arrays 
        Arrays.sort(A); 
        Arrays.sort(B); 
   
        // Note that target can be negative 
        int target = getTarget(A, n, B, m); 
   
        // target 0 means, answer is not possible 
        if (target == 0) 
            return; 
   
        int i = 0, j = 0; 
        while (i < n && j < m)  
        { 
            int diff = A[i] - B[j]; 
            if (diff == target)  
            { 
                System.out.println(A[i]+" "+B[i]); 
                return; 
            } 
   
            // Look for a greater value in A[] 
            else if (diff < target) 
                i++; 
   
            // Look for a greater value in B[] 
            else
                j++; 
        } 
    }
    
    static int frogRiver(int X, int[] A){
    	int K = -1;
    	int tmpCnt = X;
    	int[] tmpArr = new int[X+1];
    	for(int i=0;i<A.length;i++){
    		int currVal = A[i];
    		if(currVal <= X && tmpArr[currVal] != currVal){
    			tmpArr[currVal] = currVal;
    			tmpCnt--;
    			if(tmpCnt == 0){
    				return i;
    			}
    		}
    	}
    	return K;
    }
    
    static int maxTripletProduct(int A[]){
    	int maxProduct = -1;
    	Arrays.sort(A);
    	int len = A.length;
    	maxProduct = A[len-1]*A[len-2]*A[len-3];
    	if(A[0]<0 && A[1]<0){
    		int tmpMaxProduct = A[0]*A[1]*A[len-3];
    		if(tmpMaxProduct > maxProduct)
    			maxProduct = tmpMaxProduct;
    	}    	    	
    	return maxProduct;
    }
    
    static int numOfIntersections(int A[]){
    	//[1,5,2,1,4,0]
    	int sumIntersections = 0;
    	int len = A.length;
    	for(int i=0;i<len-1;i++){
    		int maxPoint = i + A[i];//6
    		int minPoint = i - A[i];//-4
    		for(int j = i+1;j<len;j++){
    			int nextDiscMaxPoint = j+A[j];//4
    			int nextDiscMinPoint = j-A[j];//0
    			if((nextDiscMaxPoint <= maxPoint && nextDiscMaxPoint >= minPoint) || 
    					((nextDiscMinPoint <= maxPoint && nextDiscMinPoint >= minPoint)) ||
    						(maxPoint <= nextDiscMaxPoint  && minPoint >= nextDiscMinPoint)){
    				System.out.println(i + " " +j);
    				sumIntersections++;
    			}
    		}
    	}
    	return sumIntersections;
    }
    
	static int numOfIntersections1(int a[]){
		//[1,5,2,1,4,0]
		/* This is easy. Intiially we calculate all start and end points of discs. After go by all line and check 
		 * count of discs inside current point. If in current point started some discs and intersection count 
		 * increased by: already active distsc multiplied by count of started in current point (result += t * dps[i]) 
		 * and count of intersections of started(result += dps[i] * (dps[i] - 1) / 2) eg. if started 5 discs in one 
		 * of point it will increased by(1+2+3+4+5 intersections, or 5*(5-1) / 2[sum formula])*/
		int result = 0;
	    int[] dps = new int[a.length];
	    int[] dpe = new int[a.length];
	
	    for (int i = 0, t = a.length - 1; i < a.length; i++)
	    {
	        int s = i > a[i]? i - a[i]: 0;
	        int e = t - i > a[i]? i + a[i]: t;
	        dps[s]++;
	        dpe[e]++;
	    }
	
	    int t = 0;
	    for (int i = 0; i < a.length; i++)
	    {
	        if (dps[i] > 0)
	        {
	            result += t * dps[i];
	            result += dps[i] * (dps[i] - 1) / 2;
	            if (10000000 < result) return -1;
	            t += dps[i];
	        }
	        t -= dpe[i];
	    }
	
	    return result;
    }
}