public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    // TO DO
   

    
    }
    
  
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    // TO DO
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    // TO DO
    return -100; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
    // TO DO  
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    // TO DO
    return null; // please remove this line!
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    // TO DO
    return null; // please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    // TO DO
    return null; // please remove this line!
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    // TO DO
    return -100; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    // TO DO
    return false; // please remove this line!
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    // TO DO
   Node newHead=new Node(head.element,null);
   Node tail=newHead;
   for(Node n=head.next; n!=null;n=n.next){
   Node copy=new Node(n.element,null);
   tail.next=copy;
   tail=copy;
   }
    return newHead; // please remove this line!
  
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    // TO DO
    Node newHead=new Node(head.element,null);
    for(Node n=head.next; n!=null;n=n.next){
   Node copy=new Node(n.element,null);
  copy.next=newHead;
  newHead=copy;
   }
    
    return newHead; // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    // TO DO
    if(idx==0){
    Node newNode=new Node(elem,null);
    newNode.next=head;
    head=newNode;
    }
    else{
    Node pred=nodeAt(idx-1);
    Node s=pred.next;
    Node newNode=new Node(elem,null);
    newNode.next=s;
    pred.next=newNode;
    }
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    // TO DO
     if(idx==0){
    Node removedNode=head;
    head=head.next;
    removedNode.next=null;
    }
    
    
     Node pred=nodeAt(idx-1);
     Node removedNode=pred.next;
   pred.next=removedNode.next;
    removedNode.next=null;
    
    return removedNode.element;; // please remove this line!
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    
    Node t=NodeAt(countNode()-1);
    t.next=head;
    Node c=head;
    head=head.next;
    c.next=null;
    // TO DO
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    // TO DO
  }
  
}