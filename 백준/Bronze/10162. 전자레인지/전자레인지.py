T = int(input())
A = 300
B = 60
C = 10
acount=0 
bcount=0
ccount = 0
flag = 0
if T % 10 != 0:
  flag = 1
  
while T > 0 and flag == 0:
  if T >= A:
    T = T-A
    acount += 1
  else:
    if T >= B:
      T = T-B
      bcount += 1
    elif T >= C:
      T = T-C
      ccount += 1

if flag == 0 :
  print(acount , bcount, ccount)
else:
  print(-1)