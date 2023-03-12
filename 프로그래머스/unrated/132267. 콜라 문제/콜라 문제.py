def solution(a, b, n):
    result = 0
    while n >= a:
        mok, nam = divmod(n,a) # d -> 몫, n -> 나머지
        #print(mok,nam)
        result += mok*b
        #print("re" ,result)
        n = mok*b + nam
        
    return result