# def solution(n, words):
#     answer = []

#     # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    
#     import collections 
    
    
#     check = 0
#     # 중복체크 어떻게?
#     # 틀린단어??;
#     d = {i:[] for i in range(n)}
#     d2 = dict(collections.Counter(words))
#     jungbok = []
    
#     temp = 0
#     hh = []
    
    
#     for i in d2.items():
#         if i[1] != 1: # 중복체크 
            
#             jungbok.append(i[0])
    
     
        
#     if words[0] in jungbok: # 일단 여기 체크해야함 !!!!!!!!!!!! 아
#         hh.append(0) #왜 0?웅 맞지 아 ㅎㅎㅎ
    
    
#     for j in range(1,len(words)):
#         if words[j] in jungbok: # 일단 여기 체크해야함 !!!!!!!!!!!! 아
#             hh.append(j) # 포기해...
#         if len(hh) >= 2: # 만 if문 도는거잖어 그러면 안되는거지 만약에 kick, kick,kick 3개 들어오면 로 인식하잖아 사실 정답은 인데
#                 j = max(hh)   #아 그냥 길이가 2만 되도 저게 발동한다는거지? 하...? 그르면 일단 리스트에 받아두고 
#                 return [(j%n)+1, (j//n)+1] # 
            
#             # 0,3,6 일 때 1번쨰 사람
#             # 1,4,7 일 때 2번째
#             # 2,5,8일 때 3번째 ㅋㅋㅋ
#             # 3씩 더해지는데, 그게 앞에가 0,1,2 가 있단 말이야 그지 
            
#             # j = 0,1,2 n = 3일 떄 ---> 0 
#             # j = 3,4,5 n = 3 --> 1
        
#         if words[j-1][-1] != words[j][0]: # 틀린 단어 검사
            
#             #i 번째 사람이 , j//n턴에서 탈락 
#             return[(j%n)+1 , (j//n)+1]  # 이거 틀린거네 good 테케 2번이 else 일 때잖어
#         # 그 뭔지 알거같은게 아니 그림판 지우개 왜이렇게 작아
#     return [0,0] 
def solution(n, words):
    for i in range(1, len(words)):
        if words[i][0] != words[i-1][-1]  or words[i] in words[:i] :
            return [(i%n)+1, (i//n)+1]
    else:
        return [0,0]
