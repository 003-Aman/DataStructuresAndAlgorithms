"""
breadth first search is a search algorithm that starts at the root node and explores all of the neighbor nodes at the present depth prior to moving on to the nodes at the next depth level
it is different from dfs in terms of the order in which the nodes are visited
otherwise everything is the same
needs more research on their difference
"""


def breadth_first_search(graph, start):
    visited = set()
    queue = [start]
    visited.add(start)
    while queue:
        vertex = queue.pop(0)
        for neighbor in graph[vertex]:
            if neighbor not in visited:
                visited.add(neighbor)
                queue.append(neighbor)
    return visited











