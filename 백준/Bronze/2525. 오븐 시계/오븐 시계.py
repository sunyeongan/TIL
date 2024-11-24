import sys

h,m = map(int,sys.stdin.readline().split())
cook_time = int(sys.stdin.readline())

h += cook_time // 60
m += cook_time % 60

while True:
  if m >= 60:
    h += 1
    m -= 60
  if h >= 24:
    h -= 24
  else:
    break

print(h,m)