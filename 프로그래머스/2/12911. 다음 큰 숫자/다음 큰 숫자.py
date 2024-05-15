def solution(n):
    answer = 0
    expected_num = n+1
    bin_n = bin(n)
    
    for i in range(expected_num, 1000000):
        bin_en = bin(i)
        if bin_n.count('1') == bin_en.count('1'):
            
            return i