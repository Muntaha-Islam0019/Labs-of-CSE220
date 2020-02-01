/* Class containing left and right child of current
node and element value*/
class Node {
    int element;
    Node left, right;

    Node(int item) {
        element = item;
        left = right = null;
    }
}
