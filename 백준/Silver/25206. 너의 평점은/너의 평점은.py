import sys

scores =  [list(map(str,sys.stdin.readline().split())) for _ in range(20)]

grade = {'A+':4.5, 'A0':4.0, 'B+':3.5, 'B0':3.0, 'C+':2.5, 'C0':2.0, 'D+':1.5, 'D0':1.0, 'F':0.0}
total_score = 0
hak = 0
total_hak = 0.0
for s in scores:
    if s[2] == 'P':
        continue
    else:
        hak = float(s[1])
        total_score += hak * grade[s[2]]
        total_hak += hak
print(f'{total_score/total_hak:.06f}')