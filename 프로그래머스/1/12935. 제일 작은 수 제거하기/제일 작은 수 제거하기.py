def solution(arr):
    arr.remove(min(arr))
    if len(arr) <= 1:
        arr.append(-1)
        
    return arr