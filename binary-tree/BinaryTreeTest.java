

public class BinaryTreeTest {

  public static void main(String[] args) {

    new BinaryTreeTest().run();
  }

  // Node Class
  static class Node {
    Node left;

    Node right;

    Person value;

    public Node(Person value) {
      this.value = value;
    }
  }

  public void run() {
	    
  }

  public void insert(Node node, Person value) {
    if (value.getId() < node.value.getId()) {
      if (node.left != null) {
        insert(node.left, value);
      } else {
        System.out.println("  Inserted " + value + " to left of "
            + node.value);
        node.left = new Node(value);
      }
    } else if (value.getId() > node.value.getId()) {
      if (node.right != null) {
        insert(node.right, value);
      } else {
        System.out.println("  Inserted " + value + " to right of "
            + node.value);
        node.right = new Node(value);
      }
    }
  }

  public void printInOrder(Node node) {
    if (node != null) {
      printInOrder(node.left);
      System.out.println("  Traversed " + node.value);
      printInOrder(node.right);
    }
  }

  
 

}