N = int(input())
words = [input() for _ in range(N)]
output = ["".join([w[0],w[-1]]) for w in words ]

print(*output, sep='\n')