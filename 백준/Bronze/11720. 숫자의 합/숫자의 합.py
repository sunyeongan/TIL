import sys
N = int(sys.stdin.readline())
nums = list(sys.stdin.readline())
print(sum([int(i) for i in nums[:-1]]))