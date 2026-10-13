# MediRoute - Java DSA Project

A console-based medical supply delivery and allocation platform implemented in Java for Eclipse.

## Packages
- `medroute`: application entry point and DSA demo menu
- `model`: Medicine, Hospital, Warehouse, Inventory, SupplyRequest, Shipment, EmergencyRequest
- `database`: simple in-memory repositories
- `stringalgo`: KMP, Z Algorithm, Rabin-Karp, Aho-Corasick
- `suffix`: Suffix Array, SA-IS wrapper, LCP, Suffix Tree demonstration, Suffix Automaton
- `dynamicprogramming`: Levenshtein, Damerau-Levenshtein, Weighted Edit Distance, Bitmask DP, Matrix Chain Multiplication
- `graph`: Dijkstra, Ford-Fulkerson/Edmonds-Karp, Bipartite Matching, Min-Cut
- `approximation`: Vertex Cover approximation, SAT evaluator, Clique utility
- `randomized`: Randomized QuickSort, Reservoir Sampling, Miller-Rabin
- `parallel`: Parallel Reduce, Blelloch Scan, Brent theorem estimate
- `services`: application integration services
- `utils`: sample data and helper utilities

## Run in Eclipse
Import as an Existing Java Project, then run `src/medroute/Main.java` as a Java Application. Java 17+ is recommended.

## Demo flow
1. Search `paracetmol` to see edit-distance correction.
2. Choose Emergency Request and enter a sentence containing `oxygen`, `ICU`, or `urgent`.
3. Run allocation and delivery route modules.
4. Open DSA Demonstrations to execute individual algorithms.

## Module mapping to the problem statement

**M1 - String Algorithms:** KMP, Z-Function, Rabin-Karp, Aho-Corasick.

**M2 - Suffix Structures:** Suffix Array, SA-IS interface, LCP, Suffix Tree, Suffix Automaton.

**M3 - Advanced Dynamic Programming:** Levenshtein/Damerau-Levenshtein, Weighted Edit Distance, Bitmask DP, Matrix Chain Multiplication.

**M4 - Network Flow:** Ford-Fulkerson, Edmonds-Karp, Dijkstra, Bipartite Matching, Min-Cut.

**M5 - NP-Completeness and Approximation:** SAT evaluator, 3-SAT compatibility/reduction helper, Clique, Clique-to-Independent-Set, Independent-Set-to-Vertex-Cover, Vertex Cover 2-approximation.

**M6 - Randomized and Parallel Algorithms:** Randomized QuickSort, Reservoir Sampling, Miller-Rabin, Parallel Reduce, Blelloch Scan, Brent theorem estimate.
