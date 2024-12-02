import sys

nums = [int(sys.stdin.readline()) for _ in range(10)]
nums_divide = []
for i in nums:
    nums_divide.append(i%42)
print(len(list(set(nums_divide))))