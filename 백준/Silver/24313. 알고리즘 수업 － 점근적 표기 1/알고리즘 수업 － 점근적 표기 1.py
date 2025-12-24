a1, a0 = map(int, input().split())
c = int(input())
n0 = int(input())
fn = a1*n0 + a0
if fn <= c*n0 and a1<=c:
    print(1)
else:
    print(0)