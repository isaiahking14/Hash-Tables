// Node is a class for storing a single node

public class Node {

    public String data;
      // data stored in this node

    // post: constructs a node with data null 
    public Node() {
        this(null);
    }

    // post: constructs a node with given data
    public Node(String data) {
        this.data = data;
    }

    
}