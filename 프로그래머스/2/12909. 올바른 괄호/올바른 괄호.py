def solution(s):
    answer = True
    
    s_li = []
        
    for i in range(len(s)):
        if s[0] == ')': 
            answer = False
            break
            
            
        if s[i] == '(':
            s_li.append(s[i])
        if s[i] == ')':
            if len(s_li) > 0:
                s_li.pop()
            
                
    if len(s_li) != 0:
        answer = False
    
    
    
    
    return answer