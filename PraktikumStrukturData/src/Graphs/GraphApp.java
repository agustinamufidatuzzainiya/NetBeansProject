/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;

/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
public class GraphApp {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A'); // 0
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4

        theGraph.addEdge(1, 0); // AB 
        theGraph.addEdge(0, 2); // BC 
        theGraph.addEdge(4, 2); // AD 
        theGraph.addEdge(1, 4);
        theGraph.addEdge(3, 4);

        theGraph.display();
//        theGraph.connectivity();
          theGraph.topo();
          theGraph.dfs();
          theGraph.bfs();
          theGraph.mst();
    }
}
