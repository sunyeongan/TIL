def solution(cards1, cards2, goal):
    answer = ''
    cards3 = []
    idx_1 = 0
    idx_2 = 0
    for i in goal:
        if idx_1 < len(cards1):
            if i == cards1[idx_1]:
                cards3.append(cards1[idx_1])
                idx_1 += 1
        if idx_2 < len(cards2):
            if i == cards2[idx_2]:
                cards3.append(cards2[idx_2])
                idx_2 += 1
    
    
    return "Yes" if cards3 == goal else "No"