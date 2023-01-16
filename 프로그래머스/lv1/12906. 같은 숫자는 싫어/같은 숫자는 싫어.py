
def solution(arr):
    answer = []
    temp = -1
    for i in arr:
        if i == temp:
            continue
        answer.append(i)
        temp = i
            
            
    return answer 