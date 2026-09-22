public class ArrayStack {
  int top;
  int[] stack;

  ArrayStack(int size) {
    stack = new int[size];
    top = -1;
  }

  void push(int data) {
    if (top == stack.length - 1) {
      System.out.println("Overflow");
      return;
    } else {
      top++;
      stack[top] = data;
    }
  }

  int pop() {
    if (top == -1) {
      System.out.println("Underflow");
      return -1;
    }
    int temp = stack[top];
    top--;
    return temp;
  }

  int peek() {
    if (top == -1) {
      System.out.println("Stack is empty.");
      return -1;
    }
    return stack[top];
  }

  void display() {
    if (top == -1) {
      System.out.println("Stack is empty.");
      return;
    }
    for (int i = top; i >= 0; i--) {
      System.out.println(stack[i]);
    }
    System.out.println();
  }

  public static void main(String[] args) {
    ArrayStack obj = new ArrayStack(7);
    obj.push(10);
    obj.push(20);
    obj.push(30);
    obj.push(50);
    obj.display();
    System.out.println("Top element: " + obj.peek());
    System.out.println("Popped: " + obj.pop());
    System.out.println("Top element after pop: " + obj.peek());
    obj.display();
  }
}
