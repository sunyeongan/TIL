def jin_change(n, q):
    rev_base = ''

    while n > 0:
        n, mod = divmod(n, q)
        rev_base += str(mod)

    return rev_base[::-1]

def solution(n):
    answer = jin_change(n,3)[::-1]
    answer = int(jin_change(int(answer,3),10))
    return answer