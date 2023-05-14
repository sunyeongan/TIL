def solution(s):
    answer = []
    s_li = s.split(" ")
    for i in s_li:
        
        tmp_li = []
        for j in range(0,len(i)):
            
            if j % 2 == 0 :
                tmp_li.append(i[j].upper())
            
            else :
                tmp_li.append(i[j].lower())
        tmp_li="".join(tmp_li)
        answer.append(tmp_li)
    

    answer=" ".join(answer)
    return answer