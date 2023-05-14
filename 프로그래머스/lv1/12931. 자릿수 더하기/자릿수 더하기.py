def solution(n):
    sum_ = 0
    n = str(n)
    for i in range(len(n)):
        sum_ += int(n[i])

    return sum_