public class Stack {
  static Node top;

  void push(int data) {
    Node newnode = new Node(data);
    if (top == null) {
      top = newnode;
      return;
    }
    Node temp = top;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newnode;
  }

  int pop() {
    if (top == null) {
      System.out.println("Stack is empty.");
      return -1;
    }
    if (top.next == null) {
      int data = top.data;
      top = null;
      return data;
    }
    Node temp = top;
    while (temp.next.next != null) {
      temp = temp.next;
    }
    int data = temp.next.data;
    temp.next = null;
    return data;
  }

  int peek() {
    if (top == null) {
      System.out.println("Stack is empty.");
      return -1;
    }
    Node temp = top;
    while (temp.next != null) {
      temp = temp.next;
    }
    return temp.data;
  }

  void display() {
    if (top == null) {
      System.out.println("Stack is empty.");
    } else {
      Node temp1 = top;
      System.out.println("Stack till now.");
      while (temp1 != null) {
        System.out.print(temp1.data + " -> ");
        temp1 = temp1.next;
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
    System.out.println("Top element: " + obj.peek());
    System.out.println("Popped: " + obj.pop());
    System.out.println("Top element after pop: " + obj.peek());
    obj.display();
  }
}
