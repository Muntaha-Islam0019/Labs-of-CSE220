// Java program for different tree traversals

class Tree {

    // Root of Binary Tree
    Node root;

    /*
    * Changing root won't be a bright choice as we need it literally everywhere.
    * That's why this currentNode should be used instead.
    * It also should be changed after each and every use.
    * */
    private Node currentNode;

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

    /* Given a binary tree, print its nodes according to the
    "bottom-up" postorder traversal. */
    private void printPostorder(Node node) {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.left);

        // then recur on right subtree
        printPostorder(node.right);

        // now deal with the node
        System.out.print(node.element + " ");
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

    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.element + " ");

        /* then recur on left sutree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }

    // Wrappers over above recursive functions
    void printPostorder() {
        printPostorder(root);
    }

    void printInorder() {
        printInorder(root);
    }

    void printPreorder() {
        printPreorder(root);
    }

    int treesHeightFinder() {
        return nodesHeightFinder(root);
    }

    int nodesHeightFinder(Node n) {

        if(n == null) return -1; /*As, if a tree has no nodes, it should not have any height.*/
        else {

            int heightOfLeftSubtree = nodesHeightFinder(n.left);
            int heightOfRightSubtree = nodesHeightFinder(n.right);

            if(heightOfLeftSubtree < heightOfRightSubtree) {
                return heightOfRightSubtree + 1;
            } else {
                return heightOfLeftSubtree + 1;
            }
        }
    }

    int levelFinder(Node node) {
        if(currentNode == null || node == null) return -1;
        else {
            if(currentNode.element == node.element) {
                currentNode = root;
                return 1;
            }
            else if(currentNode.element < node.element) {
                currentNode = currentNode.right;
                return 1 + levelFinder(node);
            } else {
                currentNode = currentNode.left;
                return 1 + levelFinder(node);
            }
        }
    }

    boolean checkEquivalence(Node rootToCheck, Node rootOfCurrent) {

        if (rootToCheck == null || rootOfCurrent == null)
            return rootToCheck == null && rootOfCurrent == null;

        return  rootOfCurrent.element == rootToCheck.element &&
                checkEquivalence(rootToCheck.left, rootOfCurrent.left) &&
                checkEquivalence(rootToCheck.right, rootOfCurrent.right);
    }

    /*Yes, you've to push this own trees root, as I'm gonna use it for recursion.*/
    Node copyTree(Node root){
        if(root == null)
            return null;
        return new Node(root.element,copyTree(root.left),copyTree(root.right));
    }
}
