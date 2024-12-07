import sys
N = int(sys.stdin.readline())
nums = [list(map(str, sys.stdin.readline().split())) for _ in range(N)]
temp_str = ''
output = []
for i in nums:
    for j in i[1]:
        temp_str += j*int(i[0])
    output.append(temp_str)
    temp_str = ''
print(*output, sep='\n')