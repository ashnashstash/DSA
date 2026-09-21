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

  void deletionatstart() {
    if (head == null) {
      System.out.println("List is empty.");

    } else {
      Node temp = head;
      // head = temp.next;
      head = head.next;
      temp.next = null;
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
      temp.next.next = null;
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

  void middleelement() {
    Node temp = head;
    int count = 0;
    while (temp != null) {
      count++;
      temp = temp.next;
    }
    temp = head;
    for (int i = 0; i < count / 2; i++) {
      temp = temp.next;
    }
    System.out.println("Middle element : " + temp.data);
  }

  void hareandtortoise() {
    Node hare = head;
    Node tortoise = head;
    while (hare != null && hare.next != null) {
      hare = hare.next.next;
      tortoise = tortoise.next;
    }
    System.out.println("Middle element : " + tortoise.data);
  }

  void sumofelements() {
    int sum = 0;
    Node temp = head;
    while (temp != null) {
      sum += temp.data;
      temp = temp.next;
    }
    System.out.println("Sum of elements in the linked list : " + sum);
  }

  void printevenelements() {
    Node temp = head;
    System.out.print("Even numbers in the linked list : ");
    while (temp != null) {
      if (temp.data % 2 == 0) {
        System.out.print(temp.data + " ");
        temp = temp.next;

      } else {
        temp = temp.next;
      }
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
    obj.insert(50);
    obj.display();
    obj.hareandtortoise();
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
