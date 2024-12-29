import sys

N = int(sys.stdin.readline())
cards = sorted(list(map(int,sys.stdin.readline().split())))
M = int(sys.stdin.readline())
check_cards = list(map(int,sys.stdin.readline().split()))

check_dict = {i:0 for i in cards}

for ori in cards:
    check_dict[ori] += 1


for c in check_cards:
    if c in check_dict:
        print(check_dict[c], end=' ')
    else:
        print(0, end=' ')

