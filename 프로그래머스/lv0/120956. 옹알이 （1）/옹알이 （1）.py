import itertools

def solution(babbling):
    answer = 0
    joka = ["aya","ye","woo","ma"]
    nPr = itertools.permutations(joka, 2)
    nPr3 = itertools.permutations(joka, 3)
    nPr4 = itertools.permutations(joka, 4)
    
    for i in nPr:
        joka.append(''.join(i))
    for i in nPr3:
        joka.append(''.join(i))
    for i in nPr4:
        joka.append(''.join(i))
    #print(joka)

    
    
    for i in babbling:
        for j in joka:
            if i == j :
                answer += 1
    return answer