def solution(nums):
    answer = 0
    temp = []
    mari = len(nums)/2
    temp = list(set(nums))
    answer = min(mari,len(temp))
        
    return answer