N = int(input())
weight_list = []
rop_max_list = []

for i in range(N):
  weight_list.append(int(input()))
weight_list.sort(reverse =True)

for num in range(N): rop_max_list.append(weight_list[num]*(num+1))
print(max(rop_max_list))