def solution(board, moves):
    answer = 0
    
    #d = {i:[] for i in range(1,6)}
    
    
    for i in range(len(board)):
        for j in range(len(board[i])):
            if i > j:
                board[i][j], board[j][i] = board[j][i], board[i][j]
    #print(board)
    
    moves_up = [i-1 for i in moves]
    #print(moves_up)
    
    k = 0
    st = []
    while True:
        
        if k >= len(moves_up):
            break
        
        for i in range(len(board[moves_up[k]])):
            if board[moves_up[k]][i] != 0:
                st.append(board[moves_up[k]][i])
                board[moves_up[k]][i] = 0
                break
        if len(st) > 1:
            if st[-1] == st[-2]:
                st.pop(-1)
                st.pop(-1)
                answer+=2
        k+=1
        
    #print(st)
    return answer