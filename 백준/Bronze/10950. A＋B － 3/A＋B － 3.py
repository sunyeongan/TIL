import sys
a = int(input())
total = []
for _ in range(a):
  b, c = map(int, sys.stdin.readline().split())
  total.append(b+c)

for i in total:
  print(i)