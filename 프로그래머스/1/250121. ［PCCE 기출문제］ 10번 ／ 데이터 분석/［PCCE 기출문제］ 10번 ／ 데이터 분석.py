def solution(data, ext, val_ext, sort_by):
    answer = []
    
    # data가 code, date, maximum, remain 순서로 구성되어있다. 
    data_dict = {"code":0, "date":1, "maximum":2, "remain":3} # data 딕셔너리 생성 
    
    for i in data: # data를 돌면서 
        if i[data_dict[ext]] < val_ext: # ext 값이 val_ext보다 작은 데이터만 뽑기
            answer.append(i) # answer리스트에 추가 ! 
    
    print(answer)
    return sorted(answer, key = lambda x: x[data_dict[sort_by]]) # sort_by에 해당하는 값을 기준으로 lambda를 이용해 오름차순 정렬 
    # answer 리스트에 있는 리스트들을 data_dict[sort_by] 번째 위치한 값을 기준으로 오름차순 정렬한다. 
