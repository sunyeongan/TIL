class Solution {
    public String solution(String new_id) {
        
        int remove_index;
        String id="";
        //1단계 
        new_id = new_id.toLowerCase();
        
        //2단계
        
        for(int i = 0; i < new_id.length(); i++){
            char c = new_id.charAt(i);
            
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c == '-') || (c == '_') || (c == '.')){
                id += String.valueOf(c);
            }
        }
        
        
        
        for(int i = 0 ; i < id.length(); i++){
            char c2 = id.charAt(i);
            //3단계 
            if(id.contains("..")){
                id = id.replace("..", ".");
            }
            if(id.contains("...")){
                id = id.replace("...", ".");
            }

        }
        //4단계
        if(id.charAt(0) == '.'){
            id = id.substring(1,id.length());
        }
        
        if(id.length() >= 1){
           
             if(id.charAt(id.length() - 1) == '.'){
                 
                 id = id.substring(0,id.length()-1);
            }
        }
        
        //5단계
        if(id.length() == 0){
            id = "a";
        }
        
        //6단계 
        if(id.length() >= 16){
            id = id.substring(0,15);
            if(id.charAt(id.length() - 1) == '.'){
                
                id = id.substring(0,id.length()-1);
            }
            
        }
        //7단계 
        char last = id.charAt(id.length() - 1);
        if(id.length() <= 2){
            if(id.length() == 2){
                id += last;
            }else if(id.length() == 1){
                id = id + last + last;
            }
        }
        
        String answer = id;
        return answer;
    }
}