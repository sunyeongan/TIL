import sys
N = int(sys.stdin.readline())
words = set([sys.stdin.readline().rstrip('\n') for _ in range(N)])
words2 = sorted(list(words), key=lambda x: (len(x), x)) # x는 사전순으로 정렬

for i in words2:
   print(i)