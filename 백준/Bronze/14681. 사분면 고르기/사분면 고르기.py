import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
result = 0

if a>=0 and b>=0:
    result = 1
elif a<0 and b>=0:
    result = 2
elif a<0 and b<0:
    result = 3
else:
    result = 4
print(result)