
import sys
N, M = map(int,sys.stdin.readline().split())
S = {sys.stdin.readline().rstrip("\n") for _ in range(N)}
cnt = 0

for _ in range(M):
    c = input()
    if c in S:
        cnt += 1 
print(cnt)