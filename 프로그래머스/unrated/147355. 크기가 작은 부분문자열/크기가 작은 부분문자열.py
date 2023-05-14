def solution(t, p):
    p_len = len(p)
    list_ = []
    for i in range(len(t)-p_len +1):
        j = p_len + i
        if int(t[i:j]) <= int(p):
            list_.append(int(t[i:j]))
    
    return len(list_)