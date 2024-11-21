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
        comb *= (len(v) + 1) # +1하는 이유는 
        # 테스트 1을 예시로 하면 
        # yello_hat만 입음
        # green_turban만 입음
        # 둘다 안입음
        # 이렇게 3가지의 경우의 수가 존재함. value안에 있는 것들을 안입을수도 있는 경우의 수 1을 추가해줘야함.
        # 하지만 이 문제에서는 각 종류별로 최대 한가지 의상을 입어야하는데, 선글라스도 안끼고, headgear도 안입으면 
        # 종류별로 아무 의상도 입지 않는 것이므로 1을 빼줘야함. 
    
    return comb-1