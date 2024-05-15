def solution(s):
    answer = ''
    vocab = {'zero': 0, 'one' : 1, 'two':2, 'three':3, 'four':4, 'five':5, 'six':6, 'seven':7, 'eight':8, 'nine':9}
    temp = ''
    temp2 = []
    result = ''
    for v in s:
        if v.isdigit(): # 숫자일 때
            result+= str(v)
        else: # 문자 일 때 
            temp += v
            if temp in vocab:
                result += str(vocab[temp])
                temp = ''
    #print(result)
    return int(result)