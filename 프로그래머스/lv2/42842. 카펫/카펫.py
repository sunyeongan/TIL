def solution(brown, yellow):
    answer = []
    tmp = []
    
    #brown + yellow = ? , ?를 만드는 그 두 수의 차가 제일 적을 때 그 두수를 리턴한다.
    for i in range(1,brown+yellow+1):
        if (brown+yellow)%i ==0:
            tmp.append(i)
    print(tmp)
    min = abs(tmp[0] - tmp[-1])
    
    for i in range(len(tmp)):
        if min > abs(tmp[i] - tmp[-i-1]) and ((tmp[i]-2)*(tmp[-i-1]-2)) == yellow:
            min = abs(tmp[i] - tmp[-i-1])
            if len(answer) != 0:
                answer = []
            
            answer.append(tmp[-i-1])
            answer.append(tmp[i])
            
            # if ((tmp[i]-2)*(tmp[-i-1]-2)) == yellow:
            #     answer.append(tmp[-i-1])
            #     answer.append(tmp[i])
            
                
                
        
    # if len(tmp) % 2 != 0:
    #     answer.append(tmp[(len(tmp)//2)])
    #     answer.append(tmp[(len(tmp)//2)])
    # else:
    #     answer.append(tmp[(len(tmp)//2)])
    #     answer.append(tmp[(len(tmp)//2)-1])
#             
    
    return answer