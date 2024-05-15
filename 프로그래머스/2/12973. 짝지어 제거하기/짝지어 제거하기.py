def solution(s):
    # 같은 알파벳이 2개 붙어있는 짝을 찾고 제거 
    '''
    i = 1
    new_list = list(s)
    s_list = list(s)
    while i < len(s):
        
        s_list = list(s)
            
        if s_list[i-1] == s_list[i]:
            
            s_list[i-1] = s_list[i] = ''
            s = ''.join(s_list)
            
            i = 0
            i += 1
        else: # 이어진 2개의 알파벳이 다르면 
            i += 1
    
    if len(s_list) == len(new_list):
        answer = 0
    if len(s) == 0:
        answer = 1
        -->시간초과 
    '''
    
    stack = []
    
    for v in s:
        if stack and stack[-1] == v: 
            
            stack.pop()
            
        else:
            
            stack.append(v)
        
    if len(stack) == 0:
        return 1
    else:
        return 0
