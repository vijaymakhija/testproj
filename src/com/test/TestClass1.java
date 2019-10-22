package com.test;

public class TestClass1 {
	
	public static int solution(int N, String S) {
        int famliesCnt = 0;
		for(int i=1;i<N+1;i++){
			boolean skipCentral = false;
        	if(!S.contains(i+"B") && !S.contains(i+"C") && !S.contains(i+"D") && !S.contains(i+"E")){
        		famliesCnt++;
        		skipCentral = true;
        	}
        	
        	if(!S.contains(i+"F") && !S.contains(i+"G") && !S.contains(i+"H") && !S.contains(i+"J")){
        		famliesCnt++;
        		skipCentral = true;
        	}
        	
        	if(!skipCentral && !S.contains(i+"D") && !S.contains(i+"E") && !S.contains(i+"F") && !S.contains(i+"G"))
        		famliesCnt++;
        	
        }
		return famliesCnt;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(2, "1A 2F 1C"));
		System.out.println(solution(1, ""));
		System.out.println(solution(3, "3D 3E 3F 2E 2F 1E 1F"));
		System.out.println(solution(1, "1E"));
	}

}

