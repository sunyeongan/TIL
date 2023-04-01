
def solution(s, n):
    answer = ''
    s_list = list(s)
    temp = 0
    for i in range(len(s_list)):
        if s_list[i] == ' ':
            s_list[i] = ' '
            
        else:
            if s_list[i].isupper():
                temp = ord(s_list[i]) + n 
                s_list[i] = chr((temp - 65) % 26 + 65)
            else:
                
                temp = ord(s_list[i]) + n 
                s_list[i] = chr((temp - 97) % 26 + 97)
    
    return ''.join(s_list)