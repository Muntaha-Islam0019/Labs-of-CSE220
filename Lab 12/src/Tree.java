class Tree {

    private Node root, currentNode;

    Tree(int element) {
        root = currentNode = new Node(element);
    }

    /*Adds elements in tree*/
    void addElement(int element) {
        if(currentNode.left == null && element <= currentNode.element) {
            currentNode.left = new Node(element);
            currentNode = root;
        } else if(currentNode.left != null && element <= currentNode.element) {
            currentNode = currentNode.left;
            addElement(element);
        } else if(currentNode.right == null) {
            currentNode.right = new Node(element);
            currentNode = root;
        } else {
            currentNode = currentNode.right;
            addElement(element);
        }
    }

    /* Given a binary tree, print its nodes in inorder*/
    private void printInorder(Node node) {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.element + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    void printSorted() {
        printInorder(root);
    }

    boolean search(int element) {
        if(element == currentNode.element) {
            currentNode = root;
            return true;
        } else if(currentNode.left != null && element < currentNode.element) {
            currentNode = currentNode.left;
            return search(element);
        } else if(currentNode.right != null && element > currentNode.element){
            currentNode = currentNode.right;
            return search(element);
        } else {
            currentNode = root;
            return false;
        }
    }
}
