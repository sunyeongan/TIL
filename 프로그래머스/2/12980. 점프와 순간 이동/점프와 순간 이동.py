def solution(n):
    
    
    ans = 1
    while n != 1: 
        if n % 2 == 0: # 짝수일 때는, 계속 순간이동
            n/=2
        else:
            n -= 1 # 홀수라면 점프
            ans += 1
    return ans