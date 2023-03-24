package ch.noseryoung.main;

public class Starter {

  public static void main(String[] args) {

    SideCreatorService creatorService = new SideCreatorService();
    TriangleManager sm = new TriangleManager(creatorService);
    sm.run();


    System.out.println("All triangles sorted by longest side:");
    for (Triangle triangle : sm.getAllTrianglesSortedByLongestSide()) {
      System.out.println(triangle);
    }
  }
}
