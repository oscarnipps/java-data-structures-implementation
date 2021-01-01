package com.company.graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

    public void depthFirstSearch(Vertex startVertex) {
        System.out.println("\ndepth first search : ");

        Stack<Vertex> stack = new Stack<>();

        stack.push(startVertex);

        while (!stack.isEmpty()) {

            Vertex current = stack.pop();

            //visit the vertex if it has not being visited or do any other type of work
            if (!current.isVisited) {
                current.setVisited(true);
                System.out.print(current.data + "\t");
            }

            //add the neighbours that have not being visited to the stack
            for (Vertex neighbour : current.neighbours) {
                if (!neighbour.isVisited) {
                    stack.push(neighbour);
                }
            }
        }
    }

    public void breadthFirstSearch(Vertex startVertex) {
        System.out.println("\nbreadth first search : ");

        Queue<Vertex> queue = new LinkedList<>();

        queue.add(startVertex);

        while (!queue.isEmpty()) {

            Vertex current = queue.poll();

            //visit the vertex if it has not being visited or do any other type of work
            if (!current.isVisited) {
                current.setVisited(true);
                System.out.print(current.data + "\t");
            }

            //add the non-visited neighbours to the queue
            for (Vertex neighbour : current.neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                }
            }
        }
    }
}
