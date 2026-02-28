from collections import defaultdict
from collections import deque

N, M, S = map(int, input().split()) # n: # of node, M : # of edge
G = defaultdict(list)

for _ in range(M):
    u, v = map(int, input().split())
    G[u].append(v)
    G[v].append(u)

for key in G:
    G[key].sort()


def dfs(start, visited=[False]*(N+1)):
    stack = deque()
    stack.append(start)
    result = []
    while stack: 
        v = stack.pop()
        if not visited[v]:
            visited[v] = True
            result.append(v)
            for u in (G[v][::-1]): 
                if not visited[u]:
                    stack.append(u)  
    return result
    
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

print(*dfs(S))
print(*bfs(S))