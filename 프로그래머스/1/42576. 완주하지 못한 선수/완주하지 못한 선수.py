def solution(participant, completion):
    answer = ''
    d = {pe : 0 for pe in participant}
    
    
    for i in participant:
        d[i] += 1
    for i in completion:
        d[i] -= 1
    
    for i in participant:
        if d[i] == 1:
            answer = i
    return answer