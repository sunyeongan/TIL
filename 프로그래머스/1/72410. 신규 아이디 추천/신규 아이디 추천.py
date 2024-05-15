def solution(new_id):
    answer = ''
    answer = new_id.lower()
    temp = []
    for i in answer:
        if i.isalpha() or i.isdigit() or i in ('-','_','.'):
            temp.append(i)
    answer = ''.join(temp)
    while '..' in answer:
        answer = answer.replace('..','.')
    
    if answer[0] == '.' or answer[-1] == '.':
        answer = answer.strip('.')
        
    if len(answer) == 0:
        answer = 'a'
    if len(answer) >= 16:
        
        answer = answer[:15]
        if answer[-1] == '.':
            answer = answer.strip('.')
    while len(answer) <= 2:
        answer = answer + answer[-1]
    return answer