#DIJKSTRA'S ALGORITHM
'''
dijkstra's algorithm is an algorithm for finding the shortest paths between nodes in a graph
it is a greedy algorithm
it works on breadth first search
where it starts from the root node and explores all the nodes at the present depth prior to moving on to the nodes at the next depth level
then it gives the minimum sum of weights of the edges

'''

# BELLMAN FORD ALGORITHM
'''
bellman ford algorithm is an algorithm for finding the shortest paths between nodes in a graph
it is a dynamic programming algorithm 
it works where dijkstra doesnt
it helps to find the minimum weight when the weight of the edges are negative
'''

#MINIMUM SPANNING TREE
'''
minimum spanning tree is a subgraph that is a tree and has as many nodes as possible

'''
#PRIM'S ALGORITHM
'''
prims algo finds the minimum spanning tree from a graph
'''
#Strongly Connected Components(scc)
'''
strongly connected components is a set of nodes in a graph that are reachable from each other
it is a cycle but every node is reachable by following a path, if not directly, through a node

'''
#KOSARAJU'S ALGORITHM
'''
we use dfs to find the strongly connected components
specifically reverse dfs

steps:
get nodes in stack(topological sort)
transpose the graph
do dfs accorrding to stack nodes on the transpose graph



'''
#Bridge in graphs
'''
bridge is an edge whose deletion increases the graph's number of connected components

'''
#Tarjan's algorithm
