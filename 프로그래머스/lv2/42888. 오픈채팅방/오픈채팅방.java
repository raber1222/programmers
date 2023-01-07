import java.util.*;
import java.util.Map.Entry;
class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        String[] s;
        ArrayList<String> list = new ArrayList<String>();
        HashMap<String,String> map= new HashMap<String,String>();
        String id;
        String res;
        
        for(int i=0; i<record.length; i++) {
        	s=record[i].split(" ");
        	
        	if(s[0].equals("Enter")) {
        		if(!map.containsKey(s[1])) {
            		map.put(s[1], s[2]);
            	}
            	else {
            		map.replace(s[1], s[2]);   
            	}
        	}
        	else if(s[0].equals("Change")) {
        		map.replace(s[1], s[2]);   
        	}
        }
        
       
        for(int i=0; i<record.length; i++) {
        	s=record[i].split(" ");
        	if(s[0].equals("Enter")) {
        		list.add(map.get(s[1])+"님이 들어왔습니다.");
        	}
        	else if(s[0].equals("Leave")) {
        		list.add(map.get(s[1])+"님이 나갔습니다.");
        	}
        	else {
        		
        	}
        }
               
       answer = new String[list.size()];
       list.toArray(answer);
   
        return answer;
    }
}