from collections import Counter

def solution(N, stages):
    answer = []

    temp = sorted(stages)
    ch_user = len(temp) # 도전한 사용자
    d = {}
    

    for i in range(1,N+1):
        if ch_user!=0:
            no_clear_user = temp.count(i) # 클리어 못한 사용자
            d[i] = no_clear_user / ch_user
            #print(i, "클리어못한 사용자 : ",no_clear_user,"도전한 사용자 :" ,ch_user)
            ch_user -= no_clear_user
        else:
            d[i] = 0
    #print(d)
    answer = sorted(d.keys(), key=lambda x: d[x], reverse=True)

    return answer
