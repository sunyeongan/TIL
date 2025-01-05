import sys
data2 = []
for i in range(5):
    data = sys.stdin.readline().rstrip()
    data2.append(data)

for i in range(15):
    for j in range(5):
        if i < len(data2[j]):
            print(data2[j][i], end="")





