def solution(phone_number):
    answer = ''
    cnt = 0
    for i in range(len(phone_number),0,-1):
        if cnt < 4:
            answer += str(phone_number[i-1])
            cnt += 1
            
        else:
            answer += '*'
    answer = answer[::-1]
    return answer