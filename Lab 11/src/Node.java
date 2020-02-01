/* Class containing left and right child of current
node and key value*/
class Node {
    int element;
    Node left, right;

    Node(int item) {
        element = item;
        left = right = null;
    }

    Node(int item, Node left, Node right) {
        element = item;
        this.left = left;
        this.right = right;
    }
}
