def solution(sizes):
    answer = 0
    min_ = []
    max_ = []
    
    for i in sizes:
        max_.append(max(i))
        min_.append(min(i))
    return max(max_)*max(min_)