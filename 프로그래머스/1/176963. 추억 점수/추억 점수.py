from collections import defaultdict

def solution(name, yearning, photo):
    answer = []
    memory_book = defaultdict(int)
    
    for i,v in enumerate(name):
        memory_book[v] = yearning[i]

    for i in photo:
        score = sum(map(lambda x: memory_book[x],i))
        answer.append(score)
        
    return answer
