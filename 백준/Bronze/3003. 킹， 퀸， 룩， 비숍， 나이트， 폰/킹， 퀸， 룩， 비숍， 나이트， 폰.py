import sys
chess = [1,1,2,2,2,8]
nums =  list(map(int,sys.stdin.readline().split()))
output = [0]*6
for i in range(len(chess)):
    for j in range(len(nums)):
        if i == j:
            if chess[i] == nums[j]:
                output[i] = 0
            else:
                output[i] = chess[i]-nums[j]
print(*output)