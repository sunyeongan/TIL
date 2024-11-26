import sys

h,m = map(int,sys.stdin.readline().split())
cook_time = int(sys.stdin.readline())

m = m+cook_time
h += m//60

if m >= 60:
    m = m%60
if h>=24:
    h = h%24
print(h,m)