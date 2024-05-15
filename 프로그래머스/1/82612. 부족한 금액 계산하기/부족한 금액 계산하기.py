def solution(price, money, count):
    answer = -1
    total_price = 0
    
    for i in range(1,count+1):
        total_price += price * i
        
    if total_price > money:
        answer = total_price - money
    else:
        answer = 0
        
        

    return answer