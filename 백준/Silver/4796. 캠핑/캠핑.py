camping=[]
while True:
  N = list(map(int,input().split()))
  
  if N[0] == 0 and N[1] == 0 and N[2] == 0:
    break
  else:
    camping.append(N)
for idx,(L,P,V) in enumerate(camping):
  camp_time  = V//P * L
  if V % P >= L: 
    camp_time += L
  else:
    camp_time += V % P
  print('Case ',end='')
  print("%d: %d" % (idx+1,camp_time))
