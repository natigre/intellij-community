package org.hanuna.gitalk.graph.graph_elements;

import org.jetbrains.annotations.Nullable;

/**
 * @author erokhins
 */
public interface GraphElement {

    public boolean selected();

    public Branch getBranch();

    /**
     * @return node, if this GraphElement was Node, another - null
     */
    @Nullable
    public Node getNode();

    /**
     * @return edge, if this GraphElement was Edge, another - null
     */
    @Nullable
    public Edge getEdge();

}
