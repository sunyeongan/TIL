def solution(answers):
    answer = []
    s = [[1,2,3,4,5], [2,1,2,3,2,4,2,5], [3,3,1,1,2,2,4,4,5,5]]

    # answers랑 s의 원소배열?들이랑 비교해야함
    # 하지만 answers의 길이가 s원소의 배열 길이보다 크면? 다시 s 배열의 0번째 인덱스로 돌아가야함
    # 그게 아니라면 계속 반복
    cnt_s = [0,0,0]
    
    for i in range(len(answers)): # 0,1,2,3,4,5
        for j in range(len(s)):# 0,1,2
            if s[j][i%len(s[j])] == answers[i]: # s[0][],s[1],s[2]
                cnt_s[j] += 1
    print(cnt_s)
    max_l = max(cnt_s)
    for i in range(len(cnt_s)):
        if max_l <= cnt_s[i]:
            max_l = cnt_s[i]
            answer.append(i+1)
    return answer