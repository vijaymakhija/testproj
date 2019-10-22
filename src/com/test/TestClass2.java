package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;

public class TestClass2 {
	class Meeting{
		String day;
		int startTimeHr;
		int startTimeMin;
		int endTimeHr;
		int endTimeMin;
		Meeting(String day, int startTimeHr, int startTimeMin, int endTimeHr, int endTimeMin) {
			this.day = day;
			this.startTimeHr = startTimeHr;
			this.startTimeMin = startTimeMin;
			this.endTimeHr = endTimeHr;
			this.endTimeMin = endTimeMin;
		}
		
	}
	public int solution(String S) {
		List<String> timeSlots = Arrays.asList(S.split("\n"));
		Collections.sort(timeSlots, new Comparator<String>() {
	        @Override
	        public int compare(String o1, String o2) {
	        	List<String> daysOfWeek = new ArrayList<String>();
	        	daysOfWeek.add("Mon");
	        	daysOfWeek.add("Tue");
	        	daysOfWeek.add("Wed");
	        	daysOfWeek.add("Thu");
	        	daysOfWeek.add("Fri");
	        	daysOfWeek.add("Sat");
	        	daysOfWeek.add("Sun");
	        	String meetArr1[] = o1.split(" ");
	        	String meetArr2[] = o2.split(" ");
	        	String day1 = meetArr1[0];
	        	String day2 = meetArr2[0];
	        	if(daysOfWeek.indexOf(day1) > daysOfWeek.indexOf(day2))
	        		return 1;
	        	else if(daysOfWeek.indexOf(day1) == daysOfWeek.indexOf(day2)){
	        		return meetArr1[1].compareTo(meetArr2[1]);
	        	}else return -1;
	        	
	        }
	    });
		LinkedHashMap<String,List<Meeting>> mpDayMeetingLst = new LinkedHashMap<String,List<Meeting>>(); 
		
		for(String timeSlot:timeSlots){
			int startTimeHr = Integer.parseInt(timeSlot.split(" ")[1].split("-")[0].split(":")[0]);
			int startTimeMin = Integer.parseInt(timeSlot.split(" ")[1].split("-")[0].split(":")[1]);
			int endTimeHr = Integer.parseInt(timeSlot.split(" ")[1].split("-")[1].split(":")[0]);
			int endTimeMin = Integer.parseInt(timeSlot.split(" ")[1].split("-")[1].split(":")[1]);			
			String day = timeSlot.split(" ")[0];
			Meeting meeting = new Meeting(day, startTimeHr, startTimeMin, endTimeHr, endTimeMin);
			List<Meeting> lstMeetingsOnDay = mpDayMeetingLst.get(day);
			if(lstMeetingsOnDay == null){
				lstMeetingsOnDay = new ArrayList<Meeting>();
				lstMeetingsOnDay.add(meeting);
				mpDayMeetingLst.put(day, lstMeetingsOnDay);
			}else{
				lstMeetingsOnDay.add(meeting);
			}
		}

		int maxDuration = 0;	
		int overFlowDur = 0;
		for(String day:mpDayMeetingLst.keySet()){
			List<Meeting> lstMeetings = mpDayMeetingLst.get(day);
			int meetCnt = 0;
			int durStartHr = 0;
			int durStartMin = 0;
			
			for(Meeting meeting:lstMeetings){
				int tmpDuration = 0;
				tmpDuration = (meeting.startTimeHr-durStartHr)*60 + (meeting.startTimeMin-durStartMin);
				if(meetCnt == 0)
					tmpDuration = tmpDuration + overFlowDur;
				if(tmpDuration > maxDuration){
					maxDuration = tmpDuration;
				}
				
				if(meetCnt < lstMeetings.size()-1){
					durStartHr = meeting.endTimeHr;
					durStartMin = meeting.endTimeMin;
				}else{
					overFlowDur = ((24-meeting.endTimeHr)*60) ;
					if(meeting.endTimeMin != 0)
						overFlowDur = overFlowDur - (60-meeting.endTimeMin);
				}
				meetCnt++;
			}
		}
						
		return maxDuration;
	}
	
	
	public static void main(String[] args) {
		String S = "Sun 10:00-20:00\n"
				+"Fri 05:00-10:00\n"
				+"Fri 16:30-23:50\n"
				+"Sat 10:00-24:00\n"
				+"Sun 01:00-04:00\n"
				+"Sat 02:00-06:00\n"
				+"Tue 03:30-18:15\n"
				+"Tue 19:00-20:00\n"
				+"Wed 04:25-15:14\n"
				+"Wed 15:14-22:40\n"
				+"Thu 00:00-23:59\n"
				+"Mon 05:00-13:00\n"
				+"Mon 15:00-21:00";
		System.out.println(new TestClass2().solution(S));
	}

}
