package com.company.graphs;

import java.util.HashMap;

public class GraphImplementation {

    public static void main(String[] args) {

        adjacencyMatrixRepresentation();

        adjacencyListRepresentation();
    }

    private static void adjacencyListRepresentation() {
        System.out.println("--- adjacency list representation ---");

        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");
        Vertex v6 = new Vertex("F");
        Vertex v7 = new Vertex("G");
        Vertex v8 = new Vertex("H");

        v1.addNeighbour(v2, v3, v4, v5);
        v2.addNeighbour(v1, v3, v7);
        v3.addNeighbour(v1, v2, v4);
        v4.addNeighbour(v1, v3, v5, v8);
        v5.addNeighbour(v1, v4,v6, v8);
        v6.addNeighbour(v5, v7, v8);
        v7.addNeighbour(v2, v6);
        v8.addNeighbour(v4, v6);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println(v6);
        System.out.println(v7);
        System.out.println(v8);

        Graph graph = new Graph();

        graph.breadthFirstSearch(v1);
    }

    private static void adjacencyMatrixRepresentation() {
        System.out.println("--- adjacency matrix representation ---");

        int vertices = 5;

        int [][] graph = new int[vertices][vertices];

        //mapping of the node value to an array index form
        HashMap<Integer,Integer> nodeIndexValue = new HashMap<>();
        nodeIndexValue.put(5,0);
        nodeIndexValue.put(4,1);
        nodeIndexValue.put(3,2);
        nodeIndexValue.put(7,3);
        nodeIndexValue.put(8,4);

        addEdge(graph,nodeIndexValue.get(5),nodeIndexValue.get(7));
        addEdge(graph,nodeIndexValue.get(7),nodeIndexValue.get(4));
        addEdge(graph,nodeIndexValue.get(7),nodeIndexValue.get(8));
        addEdge(graph,nodeIndexValue.get(7),nodeIndexValue.get(5));
        addEdge(graph,nodeIndexValue.get(4),nodeIndexValue.get(3));
        addEdge(graph,nodeIndexValue.get(4),nodeIndexValue.get(7));
        addEdge(graph,nodeIndexValue.get(3),nodeIndexValue.get(4));
        addEdge(graph,nodeIndexValue.get(3),nodeIndexValue.get(8));
        addEdge(graph,nodeIndexValue.get(8),nodeIndexValue.get(3));
        addEdge(graph,nodeIndexValue.get(8),nodeIndexValue.get(7));

        printGraph(graph);
    }

    private static void printGraph(int[][] graph) {

        for (int i = 0; i <= graph.length-1; i++){

            for (int j = 0; j <= graph[0].length-1; j++){
                System.out.print(graph[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public static void addEdge(int[][] graph, int v, int u){
        graph[v][u] = 1;
    }

    public static void addEdge(int[][] graph, int v, int u, int weight){
        graph[v][u] = weight;
    }
}