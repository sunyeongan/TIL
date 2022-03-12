N = int(input(""))
fac = 1
temp = N
for i in range(0,N):
  fac = fac * temp
  temp = temp - 1
print(fac)