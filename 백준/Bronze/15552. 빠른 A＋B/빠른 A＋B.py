import sys
cnt = int(sys.stdin.readline())
a, b = -1, -1

for i in range(cnt):
    a,b = map(int,sys.stdin.readline().split())
    print(a+b)