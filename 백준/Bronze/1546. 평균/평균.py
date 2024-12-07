import sys

N = int(sys.stdin.readline())
scores = list(map(int,sys.stdin.readline().split()))
M = max(scores)

revised_scores = [s/M*100 for s in scores]
print(sum(revised_scores)/len(revised_scores))