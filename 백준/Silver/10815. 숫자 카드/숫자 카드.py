
import sys
N_in = int(sys.stdin.readline())
cards = list(map(int,sys.stdin.readline().split()))

check = int(sys.stdin.readline())
cards_check = list(map(int,sys.stdin.readline().split()))

check_dict = {i:0 for i in cards_check}

for c in cards:
    if c in check_dict:
        check_dict[c] += 1
print(*check_dict.values())
