def solution(s):
    
    cnt = 0
    zero_count = 0
    
    while s != "1":
        or_s = len(s) # 변환 이전에 문자열 길이 
        zero_count += s.count('0')
        result = or_s - s.count('0') # 원래 문자열 길이 - 0제거후 길이 
        
        result = format(result, 'b')
        s = result
        cnt += 1
    #cnt
    #zero_count
    return [cnt, zero_count]