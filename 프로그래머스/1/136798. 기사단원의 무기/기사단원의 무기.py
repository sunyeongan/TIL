def solution(number, limit, power):
    '''
    answer = 0
    count_list = []
    count_ = []
    for i in range(1,number+1):# 1 부터 5까지의 약수를 구하라
        for j in range(1,int(i**(1/2)) + 1): # 시간초과 발생, n의 제곱근 만큼 반복하고 
            if i % j == 0: # 약수의 개수를 어떻게 리턴?
                count_list.append(i)
                if ( (j**2) != i) : 
                    count_list.append(i)
    #count함수 이용
    #print(count_list)
    for i in range(1,number+1):
        count_.append(count_list.count(i))
    #print(count_)
    
    for i in count_:
        if i <= limit:
            answer += i
        else : # 공격력 제한 수치가 넘어가면 
            answer += power # i가 아닌 power를 더함
    '''
    answer = 0
    knight = []
    divisor_knight = []
    
    # 기사번호 담은 배열
    for i in range(number):
        knight.append(i+1)
    
    # 각 기사번호 별 약수 담은 배열
    for k in knight:
        tmp = []
        for i in range(1,int(k**(1/2)) + 1):
            if k % i ==0:
                tmp.append(i)
                if ( (i**2) != k) : 
                    tmp.append(k // i)
        divisor_knight.append(len(tmp))
    
    for d in divisor_knight:
        if d <= limit:
            answer += d
        else:
            answer += power 
    return answer