"""
A graph is a collection of nodes and edges that have data associated with them
facebook is an example of a graph, it uses nodes to represent people and edges to represent connections between people
A graph is a consists of vertices and edges represented in ordered pairs (V,E)

Graph terminology
adjacency: a node is adjacent to another node if there is an edge between them
path: a path is a sequence of nodes that are connected by edges. it is literally a path
directed graph: a graph that has edges in only one direction from one node to another

spanning tree: a spanning tree is a subgraph that is a tree and has as many nodes as possible
undirected graph: a graph that has edges in both directions from one node to another

the total number of spanning trees with n vertices is 2^n or n^^(n-2)

the minimum spanning tree from a graph is found by using Prim's algorithm or Kruskal's algorithm

Spanning tree applications:
computer networks
cluster anyalysis
civil network planning

Minimum Spanning Tree applications:
to find the shortest path between two nodes in a graph
in a map
to design networks like telecommunications,water supply, electrical grids
"""
class AdjacencyMatrix:
    def __init__(self, vertices):
        self.vertices = vertices
        self.matrix = [[0] * vertices for _ in range(vertices)]

    def addEdge(self, u, v):
        self.matrix[u][v] = 1

    def checkEdge(self, u, v):
        return self.matrix[u][v]

    def removeEdge(self, u, v):
        self.matrix[u][v] = 0

    def printMatrix(self):
        for i in range(self.vertices):
            for j in range(self.vertices):
                print(self.matrix[i][j], end=" ")
            print()












