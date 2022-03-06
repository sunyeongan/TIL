N = int(input())
use_time = []


for i in range(0,N):
  start,end = input().split(' ')
  tu = (int(start),int(end))
  use_time.append(tu)

use_time = sorted(use_time,key = lambda x: (x[1],x[0]))

end = 0
dis_count = 0

for s, e in use_time:
  if s >= end:
    dis_count += 1
    end = e

print(dis_count)