package com.company.graphs;

import java.util.HashMap;

public class GraphImplementation {

    public static void main(String[] args) {

        adjacencyMatrixRepresentation();

        adjacencyListRepresentation();
    }

    private static void adjacencyListRepresentation() {
        System.out.println("--- adjacency list representation ---");

        Graph graph = new Graph();
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