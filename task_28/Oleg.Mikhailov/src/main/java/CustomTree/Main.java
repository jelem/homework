package CustomTree;

public class Main {

  public static void main(String[] args) {
    CustomTree customTree = new CustomTree();

    addElement(customTree);

    customTree.traverseForStack();
    customTree.traverseForQueue();

  }

  private static void addElement(CustomTree customTree) {
    customTree.add(3, "Oleg");
    customTree.add(2, "Toma");
    customTree.add(5, "Max");
    customTree.add(10, "Valya");
    customTree.add(4, "Yura");

  }


}
