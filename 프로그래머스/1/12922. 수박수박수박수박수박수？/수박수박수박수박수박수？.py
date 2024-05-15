def solution(n):
    answer = '수박'
    answer2 = '수'
    if (n % 2== 0):
        answer = answer*(n//2)
    else:
        answer = answer*(n//2)+answer2
    return answer