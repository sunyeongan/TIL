N = int(input(""))
for i in range(1, N*2):
  if i <= N:
    print((N-i)*" ",end="")
    print((2*i-1)*"*")
  if i > N:
    print((i-N)*" ", end="")
    print(((2*N)-(2*(i-N)-1)-2)*"*")