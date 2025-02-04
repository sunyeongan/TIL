import sys
N, B = sys.stdin.readline().split()
B = int(B)
alpha_dict = {chr(x): x - 55 for x in range(65, 91)}  # 'A' = 10, 'B' = 11, ..., 'Z' = 35
result = 0

### 36^0 이 35개 , 36^1 이 35개...

for i in range(len(N)):
    char = N[::-1][i]

    # 숫자인 경우 변환
    if char.isdigit():
        value = int(char)
    else:
        value = alpha_dict[char]  

    result += value * (B ** i)

print(result)
