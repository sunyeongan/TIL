from collections import deque

def solution(s):
    answer = -1
    stack = []
    temp = deque()
    cnt = 0
    iter = 0
    
    for i in s:
        temp.append(i)
            
    while True:
        if iter >=len(s):
            break
        #print(''.join(list(temp)))
    
        for i in ''.join(list(temp)): # 괄호 짝 맞추기 

            if not stack:
                stack.append(i)
            else:
                if (stack[-1] == '(' and i == ')') or (stack[-1] == '[' and i == ']') or (stack[-1] == '{' and i == '}') or (stack[-1] == '<' and i == '>'):
                    stack.pop()
                else:
                    stack.append(i)
        #print(stack)
        if not stack:
            cnt += 1
        
        
        # iter번 밀기 ?
        
        iter += 1
        
        shift = temp[0]
        temp.popleft()
        temp.append(shift)
        stack = [] # 스택 초기화
        
#     print(stack)

    return cnt