import sys

scores = list(map(str, sys.stdin.readline().split()))
s_li = [i[::-1] for i in scores]
print(max(s_li))