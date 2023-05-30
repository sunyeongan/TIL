import math
def solution(progresses, speeds):
    answer = []
    todo = []
    update = []
    for i in progresses:
        todo.append(100-i)
    
    for i in range(len(todo)):
        update.append(math.ceil(todo[i]/speeds[i]))
        
    print(update)
    max_len = update[0]
    cnt = 0
    for i in range(1,(len(update))):
        
        
        if max_len < update[i]:
            max_len = update[i]
            cnt += 1
            answer.append(cnt)
            cnt = 0
        else:
            
            cnt+=1
    cnt += 1
    answer.append(cnt)    
    return answer