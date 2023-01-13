def solution(money):
    answer = [0]*2
    ice = 5500
    answer[0] = money//ice
    answer[1] = money%ice
    return answer