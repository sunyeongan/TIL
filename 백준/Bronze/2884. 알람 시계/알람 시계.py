import sys

h,m = map(int,sys.stdin.readline().split())
m = m-45
if m<0:
    h-=1
    m+=60
    if h < 0:
        h+=24
else:
    pass

print(h,m)