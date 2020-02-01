public class LinkedList {
    
    public Node head;
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */
    
    public LinkedList (Object [] a) {
        
        Node n = new Node(a[0], null);
        
        head = n;
        Node tail = n;
        
        int index = 1;
        while (index < a.length) {
            
            Node node = new Node (a[index], null);
            
            tail.next = node;
            tail = node;
            
            index++;
        }
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    
    public LinkedList (Node h) {
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    
    public int countNode () {
        
        int val = 0;
        
        for (Node n = head; n != null; n = n.next)
            val++;
        
        return val;
    }
    
    /* prints the elements in the list */
    
    public void printList () {
        
        int val = countNode();
        
        for (int index = 0; index < val; index++) {
            System.out.print(get(index) + " ");
        }
        
        System.out.println();
    }
    
    // returns the reference of the Node at the given index. For invalid index return null.
    
    public Node nodeAt (int idx) {
        
        if (idx < 0 || countNode() <= idx) {
            return null;
        }
        
        Node n = head;
        int i = 0;
        
        while (i < idx) {
            i++;
            n= n.next;
        }
        
        return n;
    }
    
    
    // returns the element of the Node at the given index. For invalid idx return null.
    
    public Object get (int idx) {
        
        if (idx < 0 || idx >= countNode() )
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
    
    
    
    /* updates the element of the Node at the given index. 
     * Returns the old element that was replaced. For invalid index return null.
     * parameter: index, new element
     */
    
    public Object set (int idx, Object elem) {
        
        Node node = nodeAt(idx);
        
        if (node == null) {
            return null;
        } else {
            
            Object oldElem = node.element;
            node.element = elem;            
            return oldElem; 
        }
    }
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    
    public int indexOf (Object elem) {
        
        Node n = head;
        int index = 0;
        
        while (n != null) {
            
            if (n.element == elem)
                return index;
            
            n = n.next;
            index++;
        }
        
        return -1; 
    }
    
    // returns true if the element exists in the List, return false otherwise.
    
    public boolean contains (Object elem) {
        
        Node n = head;
        int index = 0;
        
        while (n != null) {
            
            if (n.element == elem)
                return true;
            
            n = n.next;
            index++;
        }
        
        return false;
    }
    
    // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
    
    public Node copyList () {
        
        Node copyHead = null;
        Node copyTail = null;
        
        for (Node n = head; n != null; n = n.next) {
            
            Node newNode = new Node (n.element, null);
            
            if (copyHead == null) {
                copyHead = newNode;
                copyTail = copyHead;
            } else {
                copyTail.next = newNode;
                copyTail = copyTail.next;
            }
        }
        
        return copyHead;
    }
    
    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    
    public Node reverseList () {
        
        Node newHead = null;
        
        Node n = head;
        
        while (n != null) {
            
            Node newNode = n.next;
            n.next = newHead;
            newHead = n;
            n = newNode;
        }
        
        return newHead;
    }
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    
    public void insert (Object elem, int idx) {
        
        if (idx < 0 || idx > countNode() )
            throw new IndexOutOfBoundsException();
        
        Node newNode = new Node(elem, null);
        
        if (idx == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node pred = nodeAt(idx - 1);
            newNode.next = pred.next;
            pred.next = newNode;
        }
    }
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    
    public Object remove (int index) {
        
        if (index < 0 || index >= countNode() ) {
            throw new IndexOutOfBoundsException();
        }
        
        Node removedNode = null;
        
        if (index == 0) {
            removedNode = head;
            head = head.next;
        } else {
            Node pred = nodeAt(index-1);
            removedNode = pred.next;
            pred.next = removedNode.next;
        }
        
        return removedNode.element; 
    }
    
    // Rotates the list to the left by 1 position.
    
    public void rotateLeft () {
        
        if (head != null) {
            
            Node oldHead = head;
            head = head.next;
            
            Node tail = head;
            while (tail.next != null)
                tail = tail.next;

            tail.next = oldHead;
            oldHead.next = null;
        }
    }
    
    // Rotates the list to the right by 1 position.
    
    public void rotateRight(){
        
        Node p = null;
        Node q = head;
        
        while (q.next != null) {
            p = q;
            q = q.next;
        }

        q.next = head;
        head = q;

        p.next = null;
    }
    
}