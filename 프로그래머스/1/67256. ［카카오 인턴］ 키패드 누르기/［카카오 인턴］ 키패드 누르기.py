'''
def solution(numbers, hand):
    result = ''
    curr = {}
    dist = {}
    for i in numbers:
        if i in [1,4,7]:
            result += 'L'
            curr['L'] = i
        elif i in [3,6,9]:
            result += 'R'
            curr['R'] = i
        else: # 2580 
            
            for lr, button in curr.items():
                
                dist[lr] = abs(i-button)
                print(lr, button)
            print('=====')
            print(dist, i)
            key_2580 = min(dist.keys(), key=(lambda k:dist[k]))
            result +=key_2580
            curr[key_2580] = i
            
                    
                    
    return result

'''

def solution(numbers, hand):
    answer = ''
    key_dict = {1:(0,0),2:(0,1),3:(0,2),
                4:(1,0),5:(1,1),6:(1,2),
                7:(2,0),8:(2,1),9:(2,2),
                '*':(3,0),0:(3,1),'#':(3,2)}

    left = [1,4,7]
    right = [3,6,9]
    lhand = '*'
    rhand = '#'
    for i in numbers:
        if i in left:
            answer += 'L'
            lhand = i
        elif i in right:
            answer += 'R'
            rhand = i
        else: # 2580
            curPos = key_dict[i]
            lPos = key_dict[lhand]
            rPos = key_dict[rhand]
            ldist = abs(curPos[0]-lPos[0]) + abs(curPos[1]-lPos[1])
            rdist = abs(curPos[0]-rPos[0]) + abs(curPos[1]-rPos[1])
            #print(ldist, rdist)
            if ldist < rdist:
                answer += 'L'
                lhand = i
            elif ldist > rdist:
                answer += 'R'
                rhand = i
            else:
                if hand == 'left':
                    answer += 'L'
                    lhand = i
                else:
                    answer += 'R'
                    rhand = i

    return answer
