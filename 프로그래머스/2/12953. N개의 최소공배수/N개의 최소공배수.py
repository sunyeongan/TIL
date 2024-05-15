def solution(arr):
    
    arr_re = sorted(arr, reverse=True)
    
    #d = {arr_re[0] * i : 0 for i in range(1,arr_re[0])}
    #result = []
    #print(d)
    i = 1
    
    while True:
        
        num = arr_re[0] * i
        count = 0
        for j in arr_re:
            if num % j == 0:
                count += 1
            else:
                break
        if count == len(arr_re):#temp가 모든 배열의 수의 배수일 때
            return num
        i += 1


