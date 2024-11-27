import sys

N, M = map(int, sys.stdin.readline().split())
# 바구니 N개
# M번 공 바꿈
basket = [i for i in range(1,N+1)]

for _ in range(M):
    i, j = map(int, input().split())
    temp = basket[i-1]
    basket[i-1]=basket[j-1]
    basket[j-1]=temp

print(*basket)