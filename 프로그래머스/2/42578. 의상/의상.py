from collections import defaultdict

def solution(clothes):
    clo_dic = defaultdict(list)
    # 각 종류별(key)로 최대 1가지 의상만 착용 가능 
    for i , v in enumerate(clothes):
        clo_dic[v[1]] += [v[0]]
    
    # value 길이 저장 (하나씩 입었다고 가정 ) 
    #answer = sum([len(x) for x in clo_dic.values()])
    
    # value들끼리 조합 구하기 
    #combi_list = [v for v in product(*clo_dic.values())] 
    
    comb = 1
    for v in clo_dic.values():
        print(len(v))
        comb *= (len(v) + 1)
    
    return comb-1