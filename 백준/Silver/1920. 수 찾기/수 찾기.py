n = 4
list_n = []
list_m = []
arr = [
    list(map(str, input().split('\n')))
    for _ in range(n)
]

list_n, list_m = arr[1] , arr[3]
list_n = set(map(int, list_n[0].split(' ')))
list_m = list(map(int, list_m[0].split(' ')))
i = 0
while i < len(list_m):
    if list_m[i] in list_n:
        print(1)
        i += 1
    else:
        print(0)
        i += 1


