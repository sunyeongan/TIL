def solution(players, callings):
    
    d = {pla : idx for idx, pla in enumerate(players)}
    #print(d)
    for cal in callings:
        #print(d[d[cal]])
        tmp_val = d[cal]
        tmp_p = players[tmp_val-1]
        players[tmp_val-1], players[tmp_val] =  players[tmp_val],players[tmp_val-1]
        d[cal], d[tmp_p] = d[tmp_p], d[cal]
    return players