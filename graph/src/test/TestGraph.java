package test;
import graph.*;
public class TestGraph {
    public static void main(String[] args) {
        Vertex v1 = new Vertex(0, 1, COLOR.BLACK);
        Vertex v2 = new Vertex(1, 1, COLOR.WHITE);
        Edge e1 = new UndirectedEdge(0, COLOR.RED, v1, v2, 2.5);
        System.out.println(e1);
    }
}