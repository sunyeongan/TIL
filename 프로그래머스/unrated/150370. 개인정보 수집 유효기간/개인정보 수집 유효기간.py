def solution(today, terms, privacies):
    d = {}
    day_sum = 0
    today_ = list(map(int, today.split('.')))
    today_sum = (today_[0]-2000)*12*28 + (today_[1]*28) + today_[2]
    ans  = []
    temp_li3 = []
    temp_li4 = []
    
    for i in privacies:
        temp_li3.append(i.split(' ')[1]) # priv에서 등급만 가져오기 
        temp_li4.append(i.split('.'))
    
    
    for i in range(len(temp_li4)): # priv 에서 날짜만 가져오기 
        temp_li4[i][2] = temp_li4[i][2][:2]

    for i in terms: # terms 딕셔너리 생성 
        temp_li = i.split(' ')
        d[temp_li[0]] = int(temp_li[1])

    for i, v in enumerate(temp_li3):
        
        yy,mm,dd= int(temp_li4[i][0]), int(temp_li4[i][1]), int(temp_li4[i][2])

        mm = mm + d[v]
        day_sum = (yy-2000)*12*28 + (mm*28) + (dd-1)
        
        if today_sum > day_sum:
            ans.append(i+1)

    
    return ans