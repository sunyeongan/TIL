import sys

N = int(sys.stdin.readline())
money = [25, 10, 5, 1]

C = [int(sys.stdin.readline()) for _ in range(N)]


for c in C:
    temp = []
    for j in money:
        temp.append(c//j)
        c = c % j
    print(*temp)
