from collections import deque

def solution(ingredient):
    d = []
    answer = 0
    li = [1,2,3,1]
#     answer = 0
#     a = ''.join(map(str,ingredient))
#     print(a)
#     while True:

#         if '1231' not in a : break
#         a = a.replace('1231','')
#         print(a)
#         answer += 1
#         print(answer)
#     return answer
#     cnt = 0
#     li = [1,2,3,1]
#     d = deque()
#     i = 0
#     # 1. 1231을 찾는다.
#     # 2. 찾으면 그 전 인덱스 값을 특정 리스트에 넣어두고
#     # 3. 1231 은 빼고 cnt += 1
#     # 4. 그 전 인덱스들의 원소 + 1231을 빼고 남은 원소 
    
    for i in ingredient:
        d.append(i)
        if i == 1:
            if d[-4:] == li:
                answer += 1 
                for j in range(4):
                    d.pop()
    return answer