def solution(s):
    answer = [-1] * len(s)
    min_idx = 9999999999
    
    for i in range(len(s)):
        for j in range(i+1,len(s)):
            if s[i] == s[j]: # 같은 글자가 있는 경우
                
                if j-i > len(s): # 최소거리 찾기 
                    continue
                else:
                    answer[j] = abs(j-i)
                          
                
    return answer