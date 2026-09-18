public class LinkedList {
  static Node head;

  void insert(int data) {
    Node newnode = new Node(data);
    if (head == null) {
      head = newnode;
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newnode;
  }

  void insertatstart(int data) {
    Node newnode = new Node(data);
    if (head == null) {
      head = newnode;
      return;
    } else {
      newnode.next = head;
      head = newnode;
    }
  }

  void insertatindex(int data, int index) {
    Node newnode = new Node(data);
    if (head == null) {
      System.out.println("List is empty.");

    } else {
      Node temp = head;
      for (int i = 1; i < index - 1; i++) {
        temp = temp.next;
      }
      newnode.next = temp.next;
      temp.next = newnode;
    }
  }

  void display() {
    if (head == null) {
      System.out.println("List is empty.");
    } else {
      Node temp1 = head;
      System.out.println("Linked list till now.");
      while (temp1 != null) {
        System.out.print(temp1.data + " -> ");
        temp1 = temp1.next;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    LinkedList obj = new LinkedList();
    obj.insert(10);
    obj.display();
    obj.insert(20);
    obj.display();
    obj.insert(30);
    obj.display();
    obj.insert(40);
    obj.display();
    /*
     * obj.insertatstart(50);
     * obj.display();
     */
    obj.insertatindex(60, 3);
    obj.display();
  }
}

/*
 * public class LinkedList {
 * static Node head;
 * 
 * public static void main(String[] args) {
 * Node newnode = new Node(10);
 * if (head == null) {
 * head = newnode;
 * }
 * Node temp = head;
 * Node newnode1 = new Node(20);
 * while (temp.next != null) {
 * temp = temp.next;
 * }
 * temp.next = newnode1;
 * Node temp1 = head;
 * while (temp1.next != null) {
 * System.out.print(temp.data + " -> ");
 * temp = temp.next;
 * }
 * }
 * }
 * 
 * raw implementation
 */
