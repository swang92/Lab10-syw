package hw;

import java.util.*;
import org.jgrapht.*;
import org.jgrapht.alg.interfaces.VertexColoringAlgorithm;
import org.jgrapht.graph.*;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.ClosestFirstIterator;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.traverse.RandomWalkIterator;

public class Main {

  public static void main(String[] args) {

    final String CH = CountryCodes.CH;
    final String LB = CountryCodes.LB;
    final String SD = CountryCodes.SD;
    final String NI = CountryCodes.NI;
    final String CA = CountryCodes.CA;
    final String AR = CountryCodes.AR;

    final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
    myMap.addVertex(CH);
    myMap.addVertex(LB);
    myMap.addVertex(SD);
    myMap.addVertex(NI);
    myMap.addVertex(CA);
    myMap.addVertex(AR);

    myMap.addEdge(CH, LB);
    myMap.addEdge(CH, SD);
    myMap.addEdge(CH, NI);
    myMap.addEdge(CH, CA);
    myMap.addEdge(CH, AR);

    myMap.addEdge(LB, SD);
    myMap.addEdge(LB, NI);
    myMap.addEdge(AR, SD);


    System.out.println(myMap);

    System.out.println("\nBreadthfirst iteration starting from Chad");

    final Iterator<String> bf = new BreadthFirstIterator<>(myMap, CH);
    while (bf.hasNext()) {
      final String country = bf.next();
      System.out.println(country);
    }

    System.out.println("\nClosestFirst iteration starting from Chad");
    final Iterator<String> cf = new ClosestFirstIterator<>(myMap, CH);
    while (cf.hasNext()) {
      final String country = cf.next();
      System.out.println(country);
    }

    System.out.println("\nRandomWalk iteration starting from Chad");
    final Iterator<String> rw = new RandomWalkIterator<>(myMap, CH, false, 2);
    while (rw.hasNext()) {
      final String country = rw.next();
      System.out.println(country);
    }


    System.out.println("\nTrying Greedy Coloring");

    final VertexColoringAlgorithm<String> colorTest = new GreedyColoring(myMap);
    System.out.println(colorTest.getColoring());

  }
}
