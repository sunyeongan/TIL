from collections import defaultdict
from collections import deque

N = int(input())
M = int(input())
G = defaultdict(list)

for _ in range(M):
    u, v = map(int, input().split())
    G[u].append(v)
    G[v].append(u)

for key in G:
    G[key].sort()

    
def bfs(start, visited=[False] * (N + 1)):
    que = deque()
    que.append(start)
    result = []
    while que:
        v = que.popleft()
        if not visited[v]:
            visited[v] = True
            result.append(v)
            for u in G[v]:
                que.append(u)

    return result

print(len(bfs(1))-1)