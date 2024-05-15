def solution(n, m, section):
    cnt = 0
    '''
    
    dist = section[-1] - section[0] + 1
    #print(dist)
    
    while True:
        if dist <= m: # 색칠해야하는 부분이 롤러보다 작은 경우 
            cnt += 1
            
            break
        else:#색칠해야하는 부분이 롤러보다 큰 경우 
            cnt += 1
            dist = dist - m 
            #print(dist)
    
    #print('cnt',cnt)
    '''
    painted , answer = 0, 0
    
    for i in section: 
        if i > painted: # i = 2
            painted = i + m - 1 # painted = 5
            #print(painted)
            cnt += 1

    return cnt