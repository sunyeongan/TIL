def solution(n):
    answer = [1,2]
    idx = 0
    while idx < n:
        answer.append(answer[idx] + answer[idx+1])
        idx += 1
        answer[idx] = answer[idx] % 1000000007
        
    
    
    
    
    return answer[n-1]