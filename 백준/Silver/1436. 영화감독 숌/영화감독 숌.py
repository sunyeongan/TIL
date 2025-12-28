import sys

n = int(sys.stdin.readline())
i = 666
cnt = 0

while 1:
    if '666' in str(i):
        cnt += 1
        #print(cnt,i)
    if cnt == n:
        print(i)
        break
    i += 1