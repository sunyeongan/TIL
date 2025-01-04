import sys

arr = [list(map(int, sys.stdin.readline().split())) for _ in range(9)]
max_val_ij = []
max_val = -1

for i in range(9):
    for j in range(9):
        if arr[i][j] >= max_val:
            max_val = arr[i][j]
            max_val_ij.append((i+1, j+1))
print(max_val)
print(max_val_ij[-1][0], max_val_ij[-1][1])
