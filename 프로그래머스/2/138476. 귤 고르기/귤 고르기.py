
def solution(k, tangerine):
    box_dic = {i:0 for i in tangerine}
    for i in tangerine:
        box_dic[i] += 1
    box_dic_sort = dict(sorted(box_dic.items(), key=lambda x: x[1], reverse=True))
    sum_ = 0
    key_ = []
    for b in box_dic_sort.items():
        if sum_ < k: # sum_값이 k보다 작을 때 
            sum_ += b[1]
            key_.append(b[0])
    return len(key_)