import sys
N = int(sys.stdin.readline())
nums = [tuple(map(int, sys.stdin.readline().split())) for _ in range(N)]

nums2 = sorted(nums, key=lambda x: (x[1], x[0]))

for i in nums2:
    print(i[0], i[1])