import java.util.List;
import java.util.Map;

public interface Graph<ID extends Comparable,N extends Node<ID>> {
	N addNode(N node);

	List<N> getAllNodes(ID start, ID stop);

	int getMinPathLength(ID start, ID stop);

	List<N> getAllReachableNodes(ID start);

	List<ID> getRootNames();

	Map<ID, Integer> distances(N p);

	List<ID> BFS();
}
