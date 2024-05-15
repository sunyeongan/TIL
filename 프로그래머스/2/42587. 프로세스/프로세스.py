def solution(priorities, location):
    queue =  [(i,p) for i,p in enumerate(priorities)] # 인덱스와 priorities 값을 튜플에 넣음 

    answer = 0
    #print(f'queue : {queue}')
    while True:
        cur = queue.pop(0)
        #print(f'cur : {cur}')
        if any(cur[1] < q[1] for q in queue):
            queue.append(cur)
            #print(f'queue2 : {queue}')
            
        else:
            answer += 1
            if cur[0] == location:
                return answer
    
    return 0