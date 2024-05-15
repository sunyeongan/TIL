def solution(phone_book):
    answer = True
    phone_book.sort() # 정렬을 해야 문자열 비교시에 out of range 에러 안남
    
    for i in range(len(phone_book)-1):
        
        
        
        if phone_book[i] in phone_book[i+1][:len(phone_book[i])]:
            answer=False
        
    
    return answer