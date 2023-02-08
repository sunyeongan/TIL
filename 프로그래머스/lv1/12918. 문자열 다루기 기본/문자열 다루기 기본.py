def solution(s):
    answer = False
    len_ = len(s)
    
    if len_ == 4 or len_ == 6:
        if s.isdigit():
            answer = True
        
    return answer