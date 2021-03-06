package com.tinkerpop.gremlin.giraph.process.graph.example;

import com.tinkerpop.gremlin.giraph.structure.GiraphGraph;
import com.tinkerpop.gremlin.process.Traversal;

import java.util.function.Supplier;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class TraversalSupplier1 implements Supplier<Traversal> {
    @Override
    public Traversal get() {
        return GiraphGraph.open().V().out().out().values("name");
    }
}
