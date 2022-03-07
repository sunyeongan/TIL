uno=[]
result=[]

for i in range(0,3):       
  uno.append(list(map(int,input().split())))
for i in uno:
  tmp = i.count(0)
  tmp2 = i.count(1)
  if tmp == 1:
    result.append('A')
  elif tmp == 2:
    result.append('B')
  elif tmp == 3:
    result.append('C')
  elif tmp == 4:
    result.append('D')
  elif tmp2 == 4:
    result.append('E')
for i in result:
  print(i)