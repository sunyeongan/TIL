import sys

A,B = map(int,sys.stdin.readline().rstrip('\n').split())
arr = [list(map(int, input().split())) for _ in range(A)]
arr2 = [list(map(int, input().split())) for _ in range(A)]

for i in range(0,A):
    for j in range(0,B):
        print(arr[i][j] + arr2[i][j], end=' ')
    print()