def solution(numbers):
    answer = []
    for i in range(len(numbers)):
        for j in range(i+1,len(numbers)):
            
            temp = numbers[i] + numbers[j]
            
            answer.append(temp)
    answer = sorted(list(set(answer)))
    return answer