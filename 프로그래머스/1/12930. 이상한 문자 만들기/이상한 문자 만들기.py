def solution(s):
    answer = []
    s_li = s.split(" ")
    for i,v in enumerate(s_li):
        temp_len = len(v)
        tmp_li = []
        for j in range(0,temp_len):
            
            if j % 2 == 0 :
                tmp_li.append(v[j].upper())
            
            else :
                tmp_li.append(v[j].lower())
        tmp_li="".join(tmp_li)
        answer.append(tmp_li)
    

    answer=" ".join(answer)
    return answer