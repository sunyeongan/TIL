import sys
a,b = map(int,sys.stdin.readline().split())
sequence = []

for i in range(1,100):#i 일때,
    for _ in range(i):#i번 만큼 더 넣는다.
        sequence.append(i)
#print(sequence)

print(sum(sequence[a-1:b]))