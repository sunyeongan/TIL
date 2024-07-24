ans = 0
def recursive_dfs(idx,numbers,target,val):
    global ans
    n = len(numbers)
    if idx == n and val == target:
        ans += 1
    elif idx ==n and val != target:
        return
    else:
        
        recursive_dfs(idx+1,numbers,target, val+numbers[idx])
        recursive_dfs(idx+1,numbers,target, val-numbers[idx])
        

def solution(numbers, target):
    global ans
    
    recursive_dfs(0,numbers,target,0)
    return ans