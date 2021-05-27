package base;

import java.util.Comparator;

public class BinarySearch {

    private Node root;
    private Comparator comparator;

    static Node ans = null;
    static int count = 0;

    //Searching the Tree
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public boolean search(int toSearch)
    {
        return search(root, toSearch);
    }
    private boolean search(Node p, int toSearch) {
        if (p == null)
            return false;
        else
        if (compare(toSearch, p.getValue()) == 0)
            return true;
        else
        if (compare(toSearch, p.getValue()) < 0)
            return search(p.getLeft(), toSearch);
        else
            return search(p.getRight(), toSearch);
    }

    public Node returnTheSmallest(int n, Node p) {

        if(p == null){
            return null;
        }

        if(count >= n){
            return null;
        }

        returnTheSmallest(n, p.getLeft());
        count++;

        if(count < n) {
            ans = p;
            return null;
        }

        returnTheSmallest(n, p.getRight());
        return ans;
    }

    //Manipulating the Tree
    public void delete(int toDelete)
    {
        this.root = delete(this.root, toDelete);
    }

    private Node delete(Node p, int toDelete) {
        if (p == null)  throw new RuntimeException("cannot delete.");
        else if (compare(toDelete, p.getValue()) < 0)
            p.setLeft(delete (p.getLeft(), toDelete));
        else if (compare(toDelete, p.getValue())  > 0)
           p.setRight(delete (p.getRight(), toDelete));

        else {
            if (p.getLeft() == null) return p.getRight();
            else
            if (p.getRight() == null) return p.getLeft();
            else
            {
                // get data from the rightmost node in the left subtree
                p.setValue(retrieveData(p.getLeft()));
                // delete the rightmost node in the left subtree
                p.setLeft(delete(p.getLeft(), p.getValue()));
            }
        }
        return p;
    }

    private int retrieveData(Node p) {
        while (p.getRight() != null) p = p.getRight();

        return p.getValue();
    }

    private int compare(int x, int y) {
        if(this.comparator == null)
        {
            if(x>y)
                return 1;
            else if (x==y)
                return 0;
            else
                return -1;
        }
        else
            return this.comparator.compare(x,y);
    }
    //Advanced Searches

    public void insert(int data){
        setRoot(insert(this.root, data));
    }

    private Node insert(Node p, int toInsert) {

        if (p == null){
            return new Node(toInsert);
        }

        if (compare(toInsert, p.getValue()) == 0)
            return p;

        if (compare(toInsert, p.getValue()) < 0)
            p.setLeft(insert(p.getLeft(), toInsert));
        else
            p.setRight(insert(p.getRight(), toInsert));

        return p;

    }

    public int height() {
        return height(root);
    }

    private int height(Node p) {
        if(p == null) return -1;
        else
            return 1 + Math.max( height(p.getLeft()), height(p.getRight()));
    }

    public void preOrderTraversal()
    {
        preOrderHelper(root);
    }
    private void preOrderHelper(Node r) {
        if (r != null)
        {
            System.out.print(r.getValue()+" ");
            preOrderHelper(r.getLeft());
            preOrderHelper(r.getRight());
        }
    }

    public void inOrderTraversal() {
        inOrderHelper(this.root);
    }

    private void inOrderHelper(Node r) {

        if (r != null){
            inOrderHelper(r.getLeft());
            System.out.print(r.getValue()+" ");
            inOrderHelper(r.getRight());
        }
    }

    public int returnLargestElement(){
        return largeElement(this.root);
    }
    private int largeElement(Node root){

        if (root == null)
            return -1;

        int res = root.getValue();

        int left = largeElement(root.getLeft());
        int right = largeElement(root.getRight());

        if (left > res)
            res = left;
        if (right > res)
            res = right;
        return res;
    }


    public int returnNthLargest(){
        return returnNthLargestElement(2,root).getValue();
    }

    private Node returnNthLargestElement(int n, Node p)
    {
        // Complete the method to find the k_th smallest node in a BST rooted at node p
        // Feel free to change the return type, parameters
        if(p == null)
            return null;
        if(count >= n)
            return null;

        returnNthLargestElement(n, p.getLeft());
        count++;
        if(count == n) {
            ans = p;
            return null;
        }
        returnNthLargestElement(n, p.getRight());
        return ans;
    }

}