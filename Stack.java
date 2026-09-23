public class Stack {
  static Node head;

  void push(int data) {
    Node newnode = new Node(data);
    newnode.next = head;
    head = newnode;
  }

  int pop() {
    Node temp = head;
    if (head == null) {
      System.out.println("Underflow");
      return -1;
    }
    head = head.next;
    temp.next = null;
    return temp.data;
  }

  int peek() {
    if (head == null) {
      System.out.println("Stack is empty.");
      return -1;
    }
    return head.data;
  }

  void display() {
    if (head == null) {
      System.out.println("Stack is empty.");
      return;
    } else {
      Node temp = head;
      while (temp != null) {
        System.out.println(temp.data);
        temp = temp.next;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Stack obj = new Stack();
    obj.push(10);
    obj.push(20);
    obj.push(30);
    obj.display();
    System.out.println("Head element: " + obj.peek());
    System.out.println("Popped: " + obj.pop());
    System.out.println("Head element after pop: " + obj.peek());
    obj.push(40);
    obj.display();
    System.out.println("Head element: " + obj.peek());

  }
}
