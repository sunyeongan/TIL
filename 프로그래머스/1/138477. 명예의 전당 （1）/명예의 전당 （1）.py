def solution(k, score):
    answer = []
    temp = []
    # k번째 순위보다 높으면 명예의 전당 , k번째 순위의 점수는 내려옴 
    
    for i in score:
        if len(temp) < k:
            temp.append(i)
            temp = sorted(temp,reverse=True)
            answer.append(temp[-1])
        elif len(temp) == k:
            if temp[-1] <= i:
                temp[-1] = i
                temp = sorted(temp,reverse=True)
                answer.append(temp[-1])
            else:
                answer.append(temp[-1])
        #print(temp)
                
        
        
    #print(temp)
    #print(answer)
        
    return answer