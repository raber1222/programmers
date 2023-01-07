import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        String[] s=new String[2];
        String s1;
        String s2;
        HashMap<String, Integer> termsmap = new HashMap<String, Integer>();
        int num;
        int year;
        int month;
        int day;
        String result;
        String stmonth;
        String stday;
        ArrayList<Integer> list = new ArrayList<Integer>();
        today=today.replaceAll("[^0-9]","");
        for(int i=0; i<terms.length; i++){
            s=terms[i].split(" ");
            termsmap.put(s[0],Integer.valueOf(s[1]));
        }
        
        for(int i=0; i<privacies.length; i++) {
        	s1=privacies[i].replaceAll("[^0-9]","");
        	s2=privacies[i].substring(privacies[i].length()-1);


        	num=termsmap.get(s2);
        	year=Integer.valueOf(s1.substring(0,4));
        	month=Integer.valueOf(s1.substring(4,6));
        	day=Integer.valueOf(s1.substring(6,s1.length()));
        	
        	
        	month=month+num;
        	if(day==1) {
        		month=month-1;
        		day=28;
        	}
        	else {
        		day=day-1;
        	}
        	
        	if(month<=0) {
        		year=year-1;
        		month=12;
        	}
        	
        	if(month>12) {
        		year=year+ month/12;
            	month=month%12;
            	if(month==0) {
            		year=year-1;
            		month=12;
            	}
 
        	}
        	
        	
        	
        	
        
        	if(Integer.toString(month).length()==1) {
        		stmonth="0"+Integer.toString(month);
        	}
        	else {
        		stmonth=Integer.toString(month);
        	}
        	
        	if(Integer.toString(day).length()==1) {
        		stday="0"+Integer.toString(day);
        	}
        	else {
        		stday=Integer.toString(day);
        	}
        	result=Integer.toString(year)+stmonth+stday;

        	if(Integer.valueOf(today)>Integer.valueOf(result)) {
        		list.add(i+1);
        	}
        	
        		
        }
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }
        
        
        
        return answer;
    }
}