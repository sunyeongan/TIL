def solution(left, right):
    len_ = right-left
    d = {left+i:0 for i in range(len_+1)}
    sum_ = 0
    
    for i in d:
        for j in range(1,i+1):
            if i % j == 0 :
                d[i] += 1
    
    for i in d.items():
        if i[1] % 2 == 0:
            sum_ += i[0]
        else:
            sum_ -= i[0]
    
    return sum_