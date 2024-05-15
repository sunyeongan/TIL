def solution(s, skip, index):
    answer = ''
    
    for c in s:
        i = ord(c) # 아스키코드값으로 변환 
        j = index # index만큼 이동한 알파벳 찾기
        while j > 0: # j만큼 이동해야한다면 
            i += 1 # 먼저 알파벳을 1 증가시키고 
            if i > ord('z'): # 만약 알파벳이 z의 아스키코드값을 넘어가면 다시 
                i = ord('a') # a 아스키 코드값으로 변경
            if chr(i) in skip: # 만약 알파벳이 skip에 있으면 
                j += 1 # j에 1을 더해서 한 번 더 이동
            j -= 1 # 알파벳 이동이 끝나면 -1 
        answer += chr(i)
    
    return answer