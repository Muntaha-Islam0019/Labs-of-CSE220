/*
* Had to make a custom linked list as a list takes index while inserting.
* And here, we're always adding on tail.
*
* Also, here we're always removing the head. So, the parameter
* should always take zero.
* */


class LinkedList {

    private Node head, tail;
    private int size = 0;

    void add (Object elem) {

        Node newNode = new Node(elem, null);

        if (size == 0) {
            newNode.next = head;
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    Object remove () {

        Node removedNode = head;
        head = head.next;
        size--;

        return removedNode.element;
    }
}