import sys

nums = sorted([int(sys.stdin.readline()) for _ in range(5)])
print(sum(nums)//len(nums))
print(nums[2])