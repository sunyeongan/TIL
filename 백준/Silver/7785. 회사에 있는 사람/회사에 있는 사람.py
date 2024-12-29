import sys

N = int(sys.stdin.readline())
logs = [list(map(str, sys.stdin.readline().split())) for _ in range(N)]
log_dict={}
result = []
for l in logs:
    log_dict[l[0]] =l[1]

for i in log_dict:
    if log_dict[i] == 'enter':
        result.append(i)
result = sorted(result, reverse=True)
for i in range(len(result)):
    print(result[i])
