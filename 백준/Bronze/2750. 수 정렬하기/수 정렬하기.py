import sys

N = int(sys.stdin.readline())
nums = sorted([int(sys.stdin.readline()) for _ in range(N)])

for i in nums:
    print(i)

