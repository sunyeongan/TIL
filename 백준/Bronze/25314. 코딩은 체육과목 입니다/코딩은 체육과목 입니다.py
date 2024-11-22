a = int(input())

answer = ''
if a % 4 == 0:
  answer = 'long ' * (a // 4)  
answer += 'int'
print(answer)