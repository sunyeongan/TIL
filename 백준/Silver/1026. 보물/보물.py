N = int(input())
A = list(map(int,input().split()))
B = list(map(int,input().split()))
A.sort()
bmax = max(B)
bmin = min(B)
S = 0
i = 0

while bmax >= bmin:
  S += A[i] * bmax
  i+=1
  B.remove(bmax)
  if len(B) == 0:
    break
  bmax = max(B)
print(S)