import sys
N = int(sys.stdin.readline())
note = [list(map(str, sys.stdin.readline().split())) for i in range(N)]

note2 = sorted(note, key=lambda x: int(x[0]))

for i in note2:
    print(i[0], i[1])