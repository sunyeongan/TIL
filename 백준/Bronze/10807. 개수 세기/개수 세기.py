import sys
from collections import Counter

n = int(sys.stdin.readline())
list_d =  sorted(list(map(int,sys.stdin.readline().split())))
v = int(sys.stdin.readline())

c = Counter(list_d)
result = 0
for i in c.most_common():
  if v == i[0]:
    result = i[1]
    break
print(result) 