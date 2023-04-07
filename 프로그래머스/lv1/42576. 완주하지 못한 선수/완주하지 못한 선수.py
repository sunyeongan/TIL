from collections import Counter
def solution(participant, completion):
    answer = ''
    d = Counter(participant)
    
    for i in completion:
        d[i] -= 1
    
    return d.most_common()[0][0]