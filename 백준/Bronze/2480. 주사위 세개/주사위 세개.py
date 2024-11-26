import sys
from collections import Counter

list_d =  list(map(int,sys.stdin.readline().split()))
result = 0
c = Counter(list_d)
c_most = c.most_common()[0]
# print(c.most_common())
# print(c_most)
# print(c_most[0])
if c_most[1] == 3:
    result = 10000+int(c_most[0])*1000
elif c_most[1] == 2:
    result = 1000+int(c_most[0])*100
else: # 큰 눈 숫자로 정렬 
    c_most = sorted(c.most_common(), key=lambda x:x[0], reverse=True)
    result = int(c_most[0][0])*100

#print(f'c_most : {c_most}')


print(result)