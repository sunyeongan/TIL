N = int(input())

candidate_list = []
buying = 0

for i in range(N):
  
  pick = int(input())
  candidate_list.append(pick)

if N != 1:
  
  a = candidate_list[0]
  candidate_list = candidate_list[1:]
  max_candidate = max(candidate_list)
  #print(candidate_list)
  #print("a",a)
  while a <= max_candidate: 
    
    a += 1
    candidate_list[candidate_list.index(max_candidate)] -= 1
    buying += 1
    max_candidate = max(candidate_list)
  print(buying)
  #print(candidate_list)
  #print("a",a)
else:
  print(buying)