package approximation;

/** Educational reduction: a 3-SAT instance is mapped to a graph with one
 * vertex for each literal occurrence. Vertices from the same clause are
 * not connected; compatible literals from different clauses are connected. */
public class ThreeSatToClique {
    public static boolean compatible(int literalA, int literalB) {
        return literalA != -literalB;
    }
    public static int requiredCliqueSize(int clauseCount) { return clauseCount; }
}
