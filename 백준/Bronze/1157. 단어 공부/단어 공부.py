
from collections import Counter
in_ = input()
count = Counter(in_.upper())
res1 = count.most_common()[0][1]

result = []
output = ''
for i in count.most_common():
    if i[1] == res1:
        result.append(i[0])

if len(result) > 1:
    output = '?'
else:
    output = result[0]
print(output)



