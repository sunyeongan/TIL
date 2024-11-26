import sys

# N = int(sys.stdin.readline())
nums = [int(sys.stdin.readline()) for _ in range(9)]
#nums =  list(map(int,sys.stdin.readline().split()))
max_=max(nums)
print(max_)
print(nums.index(max_)+1)