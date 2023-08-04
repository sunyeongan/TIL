def solution(a, b):
    answer = ''
    days = ['FRI','SAT','SUN','MON','TUE','WED','THU',]
    months = [31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31]
    total = 0
    for i in range(a-1):
        #print( months[i])
        total += months[i]
    total += b -1
    #print(total%7)
    answer = days[(total%7)]
    return answer