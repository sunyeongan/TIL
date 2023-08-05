def solution(x):
    answer = False
    
    x2 = x
    hap = 0
    
    while(x >= 9):
        
        if x//10 <=9:
            hap += x%10
            hap += x//10
            break
        else:
            hap += x%10
            x = x//10
    
    if len(str(x)) == 1:
        answer = True
    else:
        if x2 % hap == 0:
            answer = True
    
    return answer