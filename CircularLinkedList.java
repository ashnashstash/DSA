public class CircularLinkedList {
  static Node head;

  void insertatstart(int data) {
    Node newnode = new Node(data);
    if (head == null) {
      head = newnode;
      newnode.next = head;
      return;
    }
    newnode.next = head;
    Node temp = head;
    while (temp.next != head) {
      temp = temp.next;
    }
    newnode.next = head;
    temp.next = newnode;
    head = newnode;
  }

  void insertatend(int data) {
    Node newnode = new Node(data);
    if (head == null) {
      head = newnode;
      newnode.next = head;
      return;
    }
    Node temp = head;
    while (temp.next != head) {
      temp = temp.next;
    }
    temp.next = newnode;
    newnode.next = head;
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

  void deleteatstart() {
    if (head == null) {
      System.out.println("List is empty.");
      return;
    }
    Node temp = head;
    while (temp.next != head) {
      temp = temp.next;
    }
    temp.next = head.next;
    head = head.next;
  }

  void deleteatend() {
    if (head == null) {
      System.out.println("List is empty.");
      return;
    }
    Node temp = head;
    while (temp.next.next != head) {
      temp = temp.next;
    }
    temp.next = head;
  }

  void deleteatindex(int index) {
    if (head == null) {
      System.out.println("List is empty.");
      return;
    }
    Node temp = head;
    for (int i = 1; i < index - 1; i++) {
      temp = temp.next;
    }
    temp.next = temp.next.next;
  }

  void display() {
    if (head == null) {
      System.out.println("List is empty.");
    } else {
      Node temp1 = head;
      System.out.println("Linked list till now.");
      do {
        System.out.print(temp1.data + " -> ");
        temp1 = temp1.next;
      } while (temp1 != head);
      System.out.print("back to head");
    }
  }

  public static void main(String[] args) {
    CircularLinkedList obj = new CircularLinkedList();
    obj.insertatstart(10);
    obj.insertatend(20);
    obj.insertatstart(30);
    obj.insertatstart(40);
    obj.insertatend(50);
    obj.display();
  }
}