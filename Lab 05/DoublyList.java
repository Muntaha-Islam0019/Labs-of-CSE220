public class DoublyList{
    public Node head;
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */
    public DoublyList (Object [] a) {
        
        head = new Node(null, null, null);
        Node tail = head;
        
        for (int i = 0; i < a.length; i++) {
            
            Node mn = new Node(a[i], null, null);

            tail.next = mn;
            mn.prev = tail;
            tail = tail.next;
        }
        
        tail.next = head;
        head.prev = tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList (Node h) {
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode() {
        
        int count = 0;
        for(Node n = head.next; n != head; n = n.next){
            count++;
        }
        
        return count;
    }
    
    /* prints the elements in the list */
    public void forwardprint () {
        
        for(Node n = head.next; n != head; n = n.next)
            System.out.print(n.element + " ");
        
        System.out.println();
    }
    
    public void backwardprint () {
        
        for(Node n = head.prev; n != head; n = n.prev)
            System.out.print(n.element + " ");
        
        System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt (int idx) {
        
        if (idx >= 0 && idx < countNode()) {
            
            int index = 0;
            
            for (Node n = head.next; n != head; n = n.next) {
                
                if(index == idx)
                    return n;
                
                index++;
            }
        }
        
        throw new NullPointerException();
    }
    
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf (Object elem) {
        
        int index = 0;
        boolean found = false;
        
        for (Node n = head.next ; n != head ; n = n.next) {
            
            if (n.element == elem) {
                found = true;
                break;
            }
            
            index++;
        }
        
        if (found)
            return index;
        else
            return -1;
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert (Object elem, int idx) {
        
        if(idx >= 0 && idx < countNode()) {
            
            Node n = new Node(elem,null,null);
            
            Node suc = nodeAt(idx);
            
            Node pred = suc.prev;
            
            n.next = suc;
            n.prev = pred;
            suc.prev = n;
            pred.next = n;
            
        } else if (idx == countNode()) {
            
            Node mn = new Node(elem,null,null);
            
            Node pred = nodeAt(idx-1);
            
            mn.next = head;
            mn.prev = pred;
            head.prev = mn;
            pred.next = mn;
            
        } else {
            System.out.println("Invalid index");
        }
        
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove (int index) {
        
        if(index >= 0 && index < countNode()) {
            
            Node removedNode = nodeAt(index);
            
            Node pred = removedNode.prev;
            
            Node suc = removedNode.next;
            
            pred.next = suc;
            suc.prev = pred;
            removedNode.next = null;
            removedNode.prev = null;
            
            return removedNode.element;
        } else {
            return null;
        }
    }
}