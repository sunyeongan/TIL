def solution(n, lost, reserve):
    
    # 체육복이 0개인 학생 
    
    # 만약 reserve, lost에 같은 학생이 있다면? -> 체육복이 2개인 학생이 1개를 잃어버린 경우
    
    a = set(lost) & set(reserve) 
    
    lost = list(set(lost) - a)
    reserve = list(set(reserve) - a)
    n = n - len(lost) # 체육복이 1개 이상인 학생 
    
    
    for i in lost:
        if i - 1 in reserve:
            n += 1
            reserve.remove(i-1)
        elif i+1 in reserve:
            n+= 1
            reserve.remove(i+1)
        
    return n