class Solution {
    public String solution(int[] numbers, String hand) {
        int left = 10, right = 12;
        String answer = "";
        
        for(int n : numbers){
            if(n == 0) n = 11;
            
            if(n == 1 | n == 4 || n == 7){
                answer += "L";
                left = n;
            }else if(n == 3 | n == 6 || n == 9){
                answer += "R";
                right = n;
                
            }else{
                int ld = (Math.abs(n-left))/3 + (Math.abs(n-left))%3;
                int rd = (Math.abs(n-right))/3 + (Math.abs(n-right))%3;
                if(ld==rd){
                    if(hand.equals("right")){
                        answer+="R";
                        right = n;
                    }else{
                        answer+="L";
                        left = n;
                    }
                }else if(ld>rd){
                    answer+="R";
                    right = n;
                }else{
                    answer+="L";
                    left = n;
                }
            }
        }
        
        
        
        
        return answer;
    }
}