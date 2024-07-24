def solution(people, limit):
    answer = 0
    n = len(people)
    p = sorted(people.copy())
    print(p)
    
    start = 0
    end = n-1
    
    # 투포인터 
    while start <= end:
        if p[start] + p[end] <= limit:
            
            end -= 1
            start += 1
        else:
            end -= 1
        answer += 1
            
    return answer 