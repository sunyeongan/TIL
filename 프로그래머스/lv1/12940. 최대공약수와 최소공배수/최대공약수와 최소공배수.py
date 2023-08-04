def solution(n, m):
    answer = []
    gong_n = set()
    gong_m = set()
    sm_gong = 0
    total = 0
    
    for i in range(1,min(n,m)+1):
        if n % i == 0:
            gong_n.add(i)
        if m % i == 0:
            gong_m.add(i)
    #print(gong_n)
    #print(gong_m)
    #print(sorted(list(gong_n&gong_m)))
    gong_max = sorted(list(gong_n&gong_m))[-1]
    
    
    #if n % gong_max == 0 and m % gong_max == 0:
    
    while(1):
        n, m = min(m,n), max(m,n)
        total += m
        if total % n == 0:
            sm_gong = total
            break
        
        

        
    answer.append(gong_max)
    answer.append(sm_gong)
    return answer