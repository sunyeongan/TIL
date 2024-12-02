import sys

nums = [int(sys.stdin.readline()) for _ in range(28)]
student = [i for i in range(1,31)]
print(*sorted(list(set(student) - set(nums))), sep='\n')