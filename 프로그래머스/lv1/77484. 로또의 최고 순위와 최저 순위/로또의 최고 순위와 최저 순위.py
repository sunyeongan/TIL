from collections import defaultdict
def solution(lottos, win_nums):
    d = defaultdict(int)
    good = {6:1, 5:2, 4:3, 3:4, 2:5, 1:6, 0:6}
    
    total_cnt = 0
    zero_count = 0
    
    answer = []
    for i in lottos:
        d[i] +=1
    zero_count = d[0]
    
    for i in d.keys():
        if i in win_nums:
            total_cnt += 1
        
    
    print(good[total_cnt])
    print(good[total_cnt + zero_count])
    
    
    

    return [good[total_cnt + zero_count], good[total_cnt]]