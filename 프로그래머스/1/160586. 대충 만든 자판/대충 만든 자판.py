def solution(keymap, targets):
    answer = []
    map_dict = {}
    
    
    
    for key in keymap:
        for i, key in enumerate(key):
            if key not in map_dict:
                map_dict[key] = i + 1
            if map_dict[key] > i + 1: # 기존에 있던 map_dict의 키값이 i+1보다 크다면
                map_dict[key] = i+ 1
                

    for word in targets:
        cnt = 0
        for i in range(len(word)):
            
            if word[i] in map_dict.keys():
                
                cnt += map_dict[word[i]]
            if word[i] not in map_dict.keys():
                
                cnt = -1
                break
        answer.append(cnt)
                
    #print(map_dict)
    return answer