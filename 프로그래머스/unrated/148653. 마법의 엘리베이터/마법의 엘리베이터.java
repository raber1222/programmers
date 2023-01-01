class Solution {
    public int solution(int storey) {
        int answer = 0;
        String s= Integer.toString(storey);
        char c;
        int num;
        int nextnum=0;

        
        for(int i=s.length()-1; i>=0; i--){
            c=s.charAt(i);
            num =Character.getNumericValue(c);
            if(nextnum==1){
                num=num+1;
                nextnum=0;
            }       
            if(num==10){
                num=0;
                nextnum=1;
            }
            if(num==5){
                if(i==0 && num==5){
                    nextnum=0;
                    answer=answer+ Math.abs(10-num);
                }
                else if(i!=0 && Character.getNumericValue(s.charAt(i-1))<5){
                    nextnum=0;
                    answer=answer+ Math.abs(10-num);
                }
                else{
                    nextnum=1;
                    answer=answer+ Math.abs(10-num);
                }
                
            }
            else if(num>5){
                answer=answer+ Math.abs(10-num);
                nextnum=1;
            }
            else{
                answer=answer+ num;
                
            }
            
        }
        if(nextnum==1)
            answer=answer+1;
        return answer;
    }
}