def solution(s):

    """
    for i in range(len(temp)):
        temp[i] = temp[i].lower()
        
        if temp[i][0] == " ":
            temp[i][0] = " "
        if temp[i][0].islower(): # 첫 문자가 문자이고 소문자일 때 
            #print(chr(ord(temp[i][0]) - 32))
            temp[i] = temp[i].replace(temp[i][0], chr(ord(temp[i][0]) - 32), 1)  # 첫 문자를 대문자로 변경 
            #temp[i][0] = chr(ord(temp[i][0]) - 32)
        if temp[i][0].isalpha() == False: # 첫 문자가 소문자가 아니라면 
            if temp[i][0].isdigit() and temp[i][1].isupper(): # 첫 문자가 숫자고, 다음에 오는 문자가 대문자라면
                temp[i] = temp[i].replace(temp[i][1], chr(ord(temp[i][1]) + 32), 1)   # 그 다음 문자는 소문자로 변경
            else: # 1번째 문자가 소문자라면
                continue
            #elif temp[i][0].isupper(): # 첫 문자가 대문자라면 
            #    continue # 건너뛰기 
        
    #print(temp)
    """
    
    answer = ''
    
    s=s.split(" ")#자르고
    
    for i in s:
        if i=="":# 공백도 출력해줘야함... 생략 ㄴㄴ
            answer+=" "
            continue
        
        memo=""
        i=i.lower()# 모두 소문자로!
        
        if ord(i[0])>=48 and ord(i[0])<=57:# 첫글자가 숫자일시 
            answer+=i+" "
            continue
        else:# 첫글자가 문자일시 첫글자 대문자로
            memo=i[0]
            memo=memo.upper()
            i=memo+i[1:]
            answer+=i+" "
            
            
    
    return answer[:-1]