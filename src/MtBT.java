import java.util.LinkedList;

class MtBT implements IBinTree {
    MtBT() { }

    // returns false since empty tree has no elements
    public boolean hasElt(int e) {
        return false;
    }

    // returns 0 since empty tree has no elements
    public int size() {
        return 0;
    }

    // returns 0 since empty tree has no branches
    public int height() {
        return 0;
    }

    //returns true since the tree is empty
    public boolean isHeap() {
        return true;
    }

    //returns true bc the root is equal to 0
    public boolean smallerRoot(int a) {
        return true;
    }
    //list is empty bc the tree is empty
    public LinkedList<Integer> makeList() {return new LinkedList<>();}

    //returns empty bc the tree is empty
    public boolean empty() {
        return true;
    }
}