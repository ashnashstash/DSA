public class MergeLinkedList {
  Node head;

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

  void deletionststart() {
    if (head == null) {
      System.out.println("List is empty.");

    } else {
      Node temp = head;
      head = temp.next;
    }
  }

  void deletionatend() {
    if (head == null) {
      System.out.println("List is empty.");

    } else {
      Node temp = head;
      while (temp.next.next != null) {
        temp = temp.next;
      }
      temp.next = null;
    }
  }

  void deletionatindex(int index) {
    if (head == null) {
      System.out.println("List is empty.");

    } else {
      Node temp = head;
      if (index == 1) {
        head = head.next;
        return;
      }
      for (int i = 1; i < index - 1; i++) {
        temp = temp.next;
      }
      temp.next = temp.next.next;
    }
  }

  void updationatindex(int data, int index) {
    if (head == null) {
      System.out.println("List is empty.");

    } else {
      Node temp = head;
      if (index == 1) {
        head.data = data;
        return;
      }
      for (int i = 1; i < index; i++) {
        temp = temp.next;
      }
      temp.data = data;
    }
  }

  void mergeAlternate(MergeLinkedList list2) {
    Node temp1 = this.head;
    Node temp2 = list2.head;
    while (temp1 != null && temp2 != null) {
      Node next1 = temp1.next;
      Node next2 = temp2.next;
      temp1.next = temp2;
      if (next1 == null) {
        break;
      }
      temp2.next = next1;
      temp1 = next1;
      temp2 = next2;
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
    MergeLinkedList obj = new MergeLinkedList();
    obj.insert(10);
    obj.insert(20);
    obj.insert(30);
    obj.insert(40);
    obj.display();

    System.out.println();

    MergeLinkedList ob = new MergeLinkedList();
    ob.insert(50);
    ob.insert(60);
    ob.insert(70);
    ob.insert(80);
    ob.display();

    obj.mergeAlternate(ob);
    obj.display();
  }
}
