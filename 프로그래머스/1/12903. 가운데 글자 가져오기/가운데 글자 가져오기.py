def solution(s):
    answer = ''
    index = len(s)//2
    if len(s) % 2 == 0:
        answer = s[index-1:index+1]
    else:
        
        answer = s[index]    
    return answer