import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int cnt=0;  
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i=1; i<=order.length; i++){
            if(i!=order[cnt]){
                st.push(i);
            }
            else if(i==order[cnt]){
                answer++;
                cnt++;
            }
            while(!st.empty()){
                if(st.peek()==order[cnt]){
                    st.pop();
                    cnt++;
                    answer++;
            }
                 else
                    break;
   

            }
        
        }
        
        
        return answer;
    }
}