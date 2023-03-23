def solution(seoul):
    answer = '김서방은     '
    for i in range(len(seoul)):
        if seoul[i] == 'Kim':
            answer = answer[:5]+ str(i) + '에 있다'
    return answer