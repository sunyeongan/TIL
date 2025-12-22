import sys

N, M = map(int, input().split())
p_list = [sys.stdin.readline().strip() for i in range(N)]
q_list = [sys.stdin.readline().strip() for i in range(M)]
# print(q_list)
p_dict_alpha = {}
p_dict_int = {}
for i, v in enumerate(p_list):
    p_dict_int[i+1] = v

for i, v in enumerate(p_list):
    p_dict_alpha[v] = i+1
# print(p_dict_alpha)
# print(p_dict_int)

for q in q_list:
    if ord(q[0]) >= 65 and ord(q[0]) <= 90: # 문자 일 때
        print(p_dict_alpha[q])
    else:
        print(p_dict_int[int(q)])