package com.company.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vertex {
    public String data;
    public List<Vertex> neighbours;
    public boolean isVisited;
    public int weight;

    public Vertex(String data) {
        this.data = data;
        neighbours = new ArrayList<>();
    }

    public Vertex(String data , int weight) {
        this.data = data;
        this.weight = weight;
        neighbours = new ArrayList<>();
    }

    public void addNeighbour(Vertex... vertices) {
        this.neighbours.addAll(Arrays.asList(vertices));
    }

    public void setVisited(boolean value) {
        this.isVisited = value;
    }

    @Override
    public String toString() {
        return "{vertex '" + data + '\'' + ", neighbours= " + getNeighbours() + ", isVisited = " + isVisited +'}';
    }

    private String getNeighbours() {
        StringBuilder neighboursBuilder = new StringBuilder();

        neighboursBuilder.append("[");

        this.neighbours.forEach(vertex -> neighboursBuilder.append(" " + vertex.data));

        neighboursBuilder.append(" ]");

        return neighboursBuilder.toString();
    }
}