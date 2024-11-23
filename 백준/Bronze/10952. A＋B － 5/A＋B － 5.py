from collections import defaultdict
result = defaultdict(int)
cnt = 0
while True:
    b,c = map(int,input().split())
    if b == 0 and c == 0:
        break
    else:
        result[cnt] = b+c
        cnt += 1
for i in range(cnt):
    print(result[i])