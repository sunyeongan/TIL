def solution(id_list, report, k):
    answer = []
    repo = []
    d_li = {i:[] for i in id_list}
    singo_ = {i:0 for i in id_list}
    mail_send = {i : 0 for i in id_list}
    stop_id = set()
    
    # 중복 신고 삭제 
    
    # for i in id_list:
    #     if len(set(d_li[i])) != len(d_li[i]):
    #         #print(f'중복 신고 확인 {len(set(d_li[i]))}, {len(d_li[i])}, {d_li[i]}')
    #         singo_[d_li[i][0]] = 1 # 중복 신고시 1로 초기화
    
    report = list(set(report))
    
    for i in report:
        u_id = i.split()[0]
        report_id = i.split()[1]
        d_li[u_id].append(report_id)
        singo_[report_id] += 1
    
    
            
    for i in singo_.items():
        if i[1] >= k:
            stop_id.add(i[0])
    #print(f'신고 접수 {singo_}')
    #print(f'정지 목록 {stop_id}')
    #print(d_li)
    
        
    for i in id_list:
        for j in d_li[i]:
            if j in stop_id:
                mail_send[i] += 1
    #print(f'메일 통지 {mail_send}')
    #print(list(mail_send.values()))
    return list(mail_send.values())