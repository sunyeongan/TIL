def solution(s):
    answer = True
    
    s = s.lower()
    if s.count('y') == s.count('p'):
        answer = True 
    else:
        answer = False
    return answer