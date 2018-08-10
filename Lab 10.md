###Lab 10 Questions

**Question 1**

The order of the countries (if you change the starting point) will depend on the order which you assigned the edges. For example, if I start with CR, the order then follow CH, SD, LB, NI, CA because the edges are written in the order: 
    myMap.addEdge(CH, AR);
    myMap.addEdge(LB, SD);
    myMap.addEdge(LB, NI);
    myMap.addEdge(AR, SD);
The program first finds the edges that is shared with the starting point. Once those are exhausted, it takes the last vertex and then finds common edges. 

Closest first is going to follow the same logic as Breadth first because we didn't assign any weighted paths. If we did, we could use the getEdgeWeight method to see which countries are essentially farther or closer to each other and that's what the logic would be. RandomWalk is like the name implies, a random sorting of countries. The only additional factor here is how many steps from the starting point we would like to take. In my code, I also didn't apply weighted paths so they are all equal. 

**Question 2**

How efficient we can be with GreedyColoring depends on the order that we color the vertices. Usually, we would want to color the center country first so that you can reuse the same colors to countries on either side of it. However, if you color the "endpoint" countries, countries that are circling the central country, then you will result in more than four colors because you've increased the number of countries that touch. 


