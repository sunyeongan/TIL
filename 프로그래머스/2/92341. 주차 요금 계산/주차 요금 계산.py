from math import ceil
def solution(fees, records):
    answer = []
    p = {}
    
    # 1. 누적 주차시간 구하기 
    # 1-1 . records에서 차량 번호 별로 누적 시간 가져오기 
    
    for r in records:
        time_ = int(r[:2]) * 60 + int(r[3:5]) # 시 분 모두 계산
        car_num = r[6:10]
        if car_num not in p.keys():
            p[car_num] = [0, time_, 'IN']
        else: 
            if r[-2:] == 'IN':
                p[car_num][1], p[car_num][2] = time_, 'IN' # 입차 시간 기록 
            else:# out이면 주차요금 계산
                p[car_num][0] += time_ - p[car_num][1] # out일때 시간 - in이었을 떄 시간
                p[car_num][1] , p[car_num][2] = time_, 'OUT'
    
    for k,v in p.items():
        if v[-1] == 'IN':
            v[0] += 1439 - v[1]
    
        f = fees[1] # 기본요금 
    
        if v[0] > fees[0] :# 주차시간이 기본시간 보다 크면
            f += ceil((v[0] - fees[0]) / fees[2] ) * fees[3]
    
        answer.append([k,f]) # 차번호, 계산한 주차요금 추가 
    
    answer = sorted(answer) # 차 번호 기준으로 오름차순 정렬
    
    return [v[1] for v in answer] # 주차요금만 반환
    