def solution(k, m, score):
    answer = 0
    score.sort(reverse=True)
    

    for i in range(len(score)):
        if (i+1) % m == 0:
            p = score[i+1-m:i+1][-1]
            answer += p*m
    
    return answer