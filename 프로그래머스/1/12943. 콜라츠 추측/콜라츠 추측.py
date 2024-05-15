def solution(num):
    answer = 0
    
    while num != 1 and answer <= 500:
        if answer == 500:
            answer = -1
            break
        elif num % 2 == 0:
            num = num // 2
            answer += 1
        elif num % 2 != 0:
            num = (num*3) + 1
            answer += 1
        
    return answer