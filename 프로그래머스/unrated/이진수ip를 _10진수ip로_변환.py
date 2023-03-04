#2진수로 표현된 Ip주소를 10진수로 바꾸시오

def solution(ip_2):
    answer = ''

    split_binary_ip = ip_2.split('.')
    binary_to_num = 0
    num_ip = []
    idx = 0

    print(split_binary_ip)
    for i in split_binary_ip:

        for j in range(len(i)-1, -1, -1):

            binary_to_num += (2**int(idx)) * int(i[j])
            idx += 1

        num_ip.append(binary_to_num)
        binary_to_num = 0
        idx = 0


    print(num_ip)
    for i in num_ip:
        if i == num_ip[-1]:
            answer += str(i)
        else:
            answer += str(i) + '.'


    return answer

print(solution('10101100.00010000.11111110.00000001'))
