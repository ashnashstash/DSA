import java.util.Scanner;

public class DoublyLinkedList {
  static Nodee head;
  static Nodee tail;

  void insertatlast(int data) {
    Nodee newnode = new Nodee(data);
    if (head == null) {
      head = tail = newnode;
      return;
    } else {
      tail.next = newnode;
      newnode.prev = tail;
      tail = newnode;
    }
  }

  void insertatstart(int data) {
    Nodee newnode = new Nodee(data);
    if (head == null) {
      head = tail = newnode;
      return;
    } else {
      newnode.next = head;
      head.prev = newnode;
      head = newnode;
    }
  }

  void insertatposition(int data, int index) {
    Nodee newnode = new Nodee(data);
    if (head == null) {
      System.out.println("List is empty.");
    } else {
      Nodee temp = head;
      for (int i = 1; i < index - 1; i++) {
        temp = temp.next;
      }
      newnode.prev = temp;
      newnode.next = temp.next;
      temp.next.prev = newnode;
      temp.next = newnode;
    }
  }

  void deletionatstart() {
    if (head == null) {
      System.out.println("List is empty.");

    } else {
      head = head.next;
      head.prev = null;
    }
  }

  void deletionatend() {
    if (head == null) {
      System.out.println("List is empty.");

    } else {
      Nodee temp = head;
      while (temp.next.next != null) {
        temp = temp.next;
      }
      tail = tail.prev;
      tail.next = null;
    }
  }

  void deletionatindex(int index) {
    if (head == null) {
      System.out.println("List is empty.");

    } else {
      Nodee temp = head;
      if (index == 1) {
        head = head.next;
        return;
      }
      for (int i = 1; i < index; i++) {
        temp = temp.next;
      }
      temp.prev.next = temp.next;
      temp.next.prev = temp.prev;
    }
  }

  void backwardtraversal() {
    if (head == null) {
      System.out.println("List is empty.");
    } else {
      Nodee temp = tail;
      System.out.println("Linked List backwards.");
      while (temp != null) {
        System.out.print(temp.data + " <-> ");
        temp = temp.prev;
      }
      System.out.println("null");

    }
  }

  void display() {
    if (head == null) {
      System.out.println("List is empty.");
      return;
    } else {
      Nodee temp = head;
      System.out.println("Linked list till now.");
      while (temp != null) {
        System.out.print(temp.data + " <-> ");
        temp = temp.next;
      }
      System.out.println("null");
    }
  }

  public static void main(String[] args) {
    DoublyLinkedList obj = new DoublyLinkedList();
    Scanner sc = new Scanner(System.in);
    System.out.print("Number of element : ");
    int n = sc.nextInt();
    System.out.print("Insert elements : ");
    for (int i = 0; i < n; i++) {
      int element = sc.nextInt();
      obj.insertatlast(element);
    }
    obj.display();
  }
}
