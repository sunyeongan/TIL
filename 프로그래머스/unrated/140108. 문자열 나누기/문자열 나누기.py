def solution(s):
    answer = 0
    x_cnt = 0
    x_not_cnt = 0
    temp = s[0] # 첫 번째 문자 일단 저장
    i = 0
    
    while i < len(s):
        if s[i] == temp:
            x_cnt += 1
            
        else:
            x_not_cnt += 1
            
        if x_cnt == x_not_cnt :
            x_cnt,x_not_cnt = 0,0
            if i+1 < len(s):
                temp = s[i+1]
                answer += 1
            else:
                answer += 1  
        i += 1
    if x_cnt !=x_not_cnt:
        answer += 1 

    print(x_cnt)
    print(x_not_cnt)
    return answer