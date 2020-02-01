class LinkedList {

    private Node head;

    LinkedList(int[] a) {

        Node n = new Node(a[0], null);

        head = n;
        Node tail = n;

        int index = 1;
        while (index < a.length) {

            Node node = new Node(a[index], null);

            tail.next = node;
            tail = node;

            index++;
        }
    }

    /* Counts the number of Nodes in the list */

    int countNode() {

        int val = 0;

        for (Node n = head; n != null; n = n.next)
            val++;

        return val;
    }

    /* prints the elements in the list */

    void printList() {

        int val = countNode();

        for (int index = 0; index < val; index++) {
            System.out.print(get(index) + " ");
        }

        System.out.println();
    }

    // returns the reference of the Node at the given index. For invalid index return null.

    Node nodeAt(int idx) {

        if (idx < 0 || countNode() <= idx) {
            return null;
        }

        Node n = head;
        int i = 0;

        while (i < idx) {
            i++;
            n = n.next;
        }

        return n;
    }


    // returns the element of the Node at the given index. For invalid idx return null.

    private Object get(int idx) {

        if (idx < 0 || idx >= countNode())
            return null;

        int i = 0;
        for (Node n = head; n != null; n = n.next) {

            if (i == idx)
                return n.element;
            else
                i++;
        }

        return null;
    }
}