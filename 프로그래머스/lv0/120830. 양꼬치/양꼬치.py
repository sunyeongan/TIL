def solution(n, k):
    answer = 0
    yang = 12000
    juice = 2000
    sevice = 0
    if n >= 10:
        sevice = int(n // 10)
        answer = yang*n + juice*(k-sevice)
    else:
        answer = yang*n + juice*k
    return answer