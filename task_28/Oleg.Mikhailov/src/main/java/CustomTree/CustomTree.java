package CustomTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CustomTree {

  private Node root;
  private Queue<Node> queue = new LinkedList<>();
  Stack<Node> stack = new Stack<>();


  public void add(Integer inputKey, String inputValue) {
    Node node = new Node(inputKey, inputValue);
    if (root == null) {
      this.root = node;
      return;
    }

    Node current = root;
    while (true) {
      if (current.key == inputKey) {
        current.value = inputValue;
        return;
      }

      if (inputKey < current.key) {
        if (current.left == null) {
          current.left = node;
          return;
        }
        current = current.left;
      } else {
        if (current.right == null) {
          current.right = node;
          return;
        }
        current = current.right;
      }

    }
  }


  public void traverseForQueue() {
    queueTraverseTree(root);
    while (queue.size() != 0) {
      System.out.println(queue.peek());
      queue.remove();
    }
  }

  public void traverseForStack() {
    stackTraverseTree(root);
    while (stack.size() != 0) {
      System.out.println(stack.pop());
    }
  }

  private void stackTraverseTree(Node node) {
    if (node == null) {
      return;
    }
    if (stack.size() == 0) {
      stack.push(node);
    }

    if (node.left == null && node.right == null) {
      return;
    }

    if (node.left != null) {
      stack.push(node.left);
    }
    if (node.right != null) {
      stack.push(node.right);
    }
    stackTraverseTree(node.left);
    stackTraverseTree(node.right);

  }

  private void queueTraverseTree(Node node) {
    if (node == null) {
      return;
    }
    if (queue.size() == 0) {
      queue.add(node);
    }

    if (node.left == null && node.right == null) {
      return;
    }

    if (node.left != null) {
      queue.add(node.left);
    }
    if (node.right != null) {
      queue.add(node.right);
    }
    queueTraverseTree(node.left);
    queueTraverseTree(node.right);

  }


  private static class Node {

    private Integer key;
    private String value;

    private Node left;
    private Node right;

    public Node(Integer key, String value) {
      this.key = key;
      this.value = value;
    }

    @Override
    public String toString() {
      return key + " - " + value;
    }
  }


}
