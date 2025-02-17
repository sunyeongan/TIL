import sys

N, B = sys.stdin.readline().split()
B = int(B)
N = int(N)
result = []

while N:
    nam = N % B
    N //= B
    result.append(str(nam) if nam < 10 else chr(nam + 55))

print(''.join(result[::-1]))