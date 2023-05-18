def solution(d, budget):
    d = sorted(d)
    sum_ = 0
    cnt = 0
    
    for i in d:
        sum_ += i
        if sum_ <= budget: 
            cnt += 1
    return cnt