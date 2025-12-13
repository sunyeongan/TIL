import sys

N = int(input())
result = [0 for i in range(10001)]

for num in sys.stdin:
    result[int(num)] += 1

for i in range(10001):
    if result[i] > 0:
        for j in range(result[i]):
            print(i)