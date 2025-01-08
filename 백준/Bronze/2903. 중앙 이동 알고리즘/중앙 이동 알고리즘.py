n = int(input())
res = 4

for i in range(n):
    res = (2 * res**(1/2) - 1) ** 2

print(int(res))