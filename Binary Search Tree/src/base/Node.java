package base;

public class Node {
    private int value;
    private Node left;
    private Node right;


    public Node(int data, Node l, Node r)
    {
        left = l; right = r;
        this.value = data;
    }

    public Node(int toInsert) {
        this.value = toInsert;
    }

    public int search(String key){

        //Return the object
        return 0;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
