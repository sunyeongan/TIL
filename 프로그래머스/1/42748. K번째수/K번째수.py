def solution(array, commands):
    answer = []
    temp = 0
    for j in commands:
        
        answer.append(sorted(array[j[0]-1:j[1]])[j[2]-1])
    print(temp)
        
        
    
    return answer