import sys
N = int(sys.stdin.readline())
words = [sys.stdin.readline().rstrip("\n") for _ in range(N)]
# 현재 인덱스와 다음 인덱스 알파벳이 같으면 pass
# 현재 인덱스와 다음 인덱스 알파벳이 다르면 continue
# 만약에 순회를 돌고 있는 인덱스에서 리스트 안에 있는 알파벳이 나오면 for 종료
cnt = N
for word in words:
    for j in range(0,len(word)-1):
        if word[j] == word[j+1]:
            pass
        elif word[j] in word[j+1:]:
            cnt -= 1
            break

print(cnt)