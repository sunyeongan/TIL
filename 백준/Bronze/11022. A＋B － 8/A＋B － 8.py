from collections import defaultdict
a = int(input())
result = defaultdict(int)
for i in range(a):
    b,c = map(int,input().split())
    result[i] = [b,c,b+c]

for j in range(a):
    print(f'Case #{j+1}: {result[j][0]} + {result[j][1]} = {result[j][2]}')
