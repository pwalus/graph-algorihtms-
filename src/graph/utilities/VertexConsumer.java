package graph.utilities;

import graph.api.AdjacencyListInterface;
import graph.api.GraphInterface;
import java.util.function.Consumer;

public class VertexConsumer {

    public static void supply(GraphInterface graph, Consumer<Integer> consumer) {
        for (int v = 0; v < graph.numberOfVertices(); v++) {
            AdjacencyListInterface adjacencyList = graph.getAdjacencyList(v);
            for (int w = adjacencyList.begin(); !adjacencyList.end(); w = adjacencyList.next()) {
                consumer.accept(w);
            }
        }
    }
}
