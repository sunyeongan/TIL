import sys

N,M = map(int,sys.stdin.readline().split())

basket = [0]*N
for _ in range(M):
    i, j, k = map(int, sys.stdin.readline().split())
    for c in range(i-1,j):
        basket[c] = k
print(*basket)