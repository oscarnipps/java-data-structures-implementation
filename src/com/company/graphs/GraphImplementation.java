package com.company.graphs;

public class GraphImplementation {

    public static void main(String[] args) {
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

}
