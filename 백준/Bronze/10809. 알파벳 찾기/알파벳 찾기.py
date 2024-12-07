aList =[chr(i) for i in range(97,123)]
a_dict = {a :-1 for a in aList}
nums = list(input())
for i, v in enumerate(nums):
    if a_dict[v] == -1:
        a_dict[v] = i
    else:
        continue

print(*a_dict.values())