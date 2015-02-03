import java.util.Iterator;

public interface Node<ID extends Comparable> extends Comparable {
	ID getEdge(int i);
	int getEdgeCount();
	void addEdge(Node<ID> target);
	/** Get unique identifier for this node */
	ID getName();

	public Iterable<ID> edges();
}
