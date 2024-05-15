
def dfs(graph, start):
    stack = [start]  # 시작 노드를 스택에 추가
    visited = set()  # 방문한 노드를 추적하는 집합(set)
    dfs_node_list = []
    while stack:
        node = stack.pop()  # 스택에서 마지막 노드를 가져옴
        if node not in visited:
            visited.add(node)  # 노드를 방문한 것으로 표시
            dfs_node_list.append(node)  # 방문한 노드를 노드리스트에 추

            for neighbor in graph[node]:
                if neighbor not in visited:
                    stack.append(neighbor)
    return dfs_node_list


def solution(n, wires):
    node_list = [set() for i in range(n+1)]
    node_minimum = 9999
    for i in wires: #[1,3]

        node_list[i[0]].add(i[1])
        node_list[i[1]].add(i[0])

    for i in wires:
        # 엣지를 하나씩 지워봄
        node_list[i[0]].remove(i[1])
        node_list[i[1]].remove(i[0])

        split_node_list_cnt1 = len(dfs(node_list,i[0]))  # 엣지를 지우고 나온 노드의 개수
        split_node_list_cnt2 = n - split_node_list_cnt1 # 나머지 노드의 개수

        split_node_list_distance = abs(split_node_list_cnt1 - split_node_list_cnt2)
        

        if split_node_list_distance < node_minimum:
            node_minimum = split_node_list_distance

        # 엣지를 다시 원래대로 연결함.
        node_list[i[0]].add(i[1])
        node_list[i[1]].add(i[0])
    return node_minimum
