str = input()

result = set()
for i in range(1,len(str)+1):
    for j in range(len(str)):
        #print(str[j:j+i], j, j+i)
        result.add(str[j:j+i])
print(len(result))