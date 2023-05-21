def solution(n, arr1, arr2):
    answer = []
    
    
    for i in range(len(arr1)):
        temp = arr1[i] | arr2[i]
        temp = format(temp,'b')
        #print(temp)
        if len(temp) < n:
            
            temp = '0' * (n-len(temp)) + temp
        for j in range(len(temp)):
            temp = temp.replace('0', ' ')
            temp = temp.replace('1','#')
            
        answer.append(temp) 
    return answer