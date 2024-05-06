// ListNode is a class for storing a single node of a linked
// list.  This node class is for a list of integer values.

public class SingleListNode {
    public String data;       // data stored in this node
    public SingleListNode next;  // link to next node in the list

    // post: constructs a node with data 0 and null link
    public SingleListNode() {
        this(null, null);
    }

    // post: constructs a node with given data and null link
    public SingleListNode(String data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public SingleListNode(String data, SingleListNode next) {
        this.data = data;
        this.next = next;
    }
}