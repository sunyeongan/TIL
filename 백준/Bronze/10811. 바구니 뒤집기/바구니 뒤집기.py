import sys

N,M = map(int,sys.stdin.readline().split())
basket = [i for i in range(1,N+1)]

for _ in range(M):
    i, j = map(int, sys.stdin.readline().split())
    temp = basket[i-1:j]
    temp.reverse()
    basket[i-1:j] = temp

print(*basket)