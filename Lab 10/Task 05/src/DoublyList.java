class DoublyList {
    private Node head;

    DoublyList(int[] a) {

        head = new Node(-1, null, null);
        Node tail = head;

        for (int i1 : a) {

            Node mn = new Node(i1, null, null);

            tail.next = mn;
            mn.prev = tail;
            tail = tail.next;
        }

        tail.next = head;
        head.prev = tail;
    }

    int countNode() {

        int count = 0;
        for (Node n = head.next; n != head; n = n.next) {
            count++;
        }

        return count;
    }

    void forwardPrint() {

        for (Node n = head.next; n != head; n = n.next)
            System.out.print(n.element + " ");

        System.out.println();
    }

    Node nodeAt(int idx) {

        if (idx >= 0 && idx < countNode()) {

            int index = 0;

            for (Node n = head.next; n != head; n = n.next) {

                if (index == idx)
                    return n;

                index++;
            }
        }

        throw new NullPointerException();
    }
}