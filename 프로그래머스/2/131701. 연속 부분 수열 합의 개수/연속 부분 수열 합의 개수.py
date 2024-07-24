def solution(elements):
    len_ = 1
    seq_list = set()
    n = len(elements)
    elements = 2 * elements   
    #print(elements)
    while len_ < n+1:
        #print(f'======== len {len_} =========')
        for i in range(n):
            
            seq_list.add(sum(elements[i:len_+i]))
            #print(sum(elements[i:len_+i])) # 0 : 2
        len_+= 1
            
    #print(f'===final === {set(seq_list)}')  
    return len(seq_list)