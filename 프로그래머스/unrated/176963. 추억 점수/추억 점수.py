def solution(name, yearning, photo):
    answer = []
    memory_book = {i:0 for i in name}
    
    
    for i,v in enumerate(name):
        memory_book[v] = yearning[i]

    for i in photo:
        score = 0
        for j in range(len(i)):
            if i[j] in memory_book:
                score += memory_book[i[j]]
        answer.append(score)
    
    return answer