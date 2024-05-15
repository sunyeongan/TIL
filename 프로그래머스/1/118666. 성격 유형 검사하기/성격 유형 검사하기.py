def solution(survey, choices):
    answer = ''
    
    # AN
    # 선택 : 1, 2, 3  -> A
    # 점수 : 3, 2, 1

    # 선택 : 5, 6, 7 -> N
    # 점수 : 1, 2, 3
    
    s_type = ['R', 'T', 'C', 'F', 'J', 'M', 'A', 'N']
    d = {i:0 for i in s_type}
    score = {1:3,2:2,3:1,5:1,6:2,7:3}
    print(d)
    
    k = 0
    for v in survey:
        t1 = v[0] # A
        t2 = v[1] # N
        
        if choices[k] in [1,2,3]:
            d[t1] += score[choices[k]] # 
            
            #print(t1, choices[k], score[choices[k]])
        elif choices[k] in [5,6,7]:
            d[t2] += score[choices[k]]
            #print(t2,choices[k], score[choices[k]])
        k += 1
    print(d)
    
#     for i in range(len(s_type)):
        
        
        
#         if d[s_type[i]] < len(s_type):
#             # print(i, d[s_type[i]])
#             if d[s_type[i]] > d[s_type[i+1]]: # 0,1  
#                 print(d[s_type[i]])
#             elif d[s_type[i]] < d[s_type[i+1]]:
#                 print(d[s_type[i+1]])
    p1 = 0
    p2 = 1
    while p2 < 8:
        
        if d[s_type[p1]] > d[s_type[p2]]: # 0,1  2,3 , 4,5 , 6,7
            answer+=s_type[p1]
        elif d[s_type[p1]] < d[s_type[p2]]:
            answer+=s_type[p2]
        else: # 두 지표의 점수가 같은 경우
            
            answer+=min(s_type[p1], s_type[p2])
            
        p1+=2
        p2+=2
        
        
    
        
    return answer
