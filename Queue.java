public class Queue {
  static Node front;
  static Node rear;

  void enqueue(int data) {
    Node newnode = new Node(data);
    if (rear == null) {
      front = rear = newnode;
    } else {
      rear.next = newnode;
      rear = newnode;
    }
  }

  void dequeue() {
    if (front == null) {
      System.out.println("Queue is empty");
      return;
    }
    System.out.println("Remove: " + front.data);
    front = front.next;
    if (front == null) {
      rear = null;
    }
  }

  int peek() {
    return front.data;
  }

  void display() {
    Node temp = front;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Queue obj = new Queue();
    obj.enqueue(10);
    obj.enqueue(20);
    obj.enqueue(30);
    obj.enqueue(40);
    obj.display();
    System.out.println("Front element: " + obj.peek());
    obj.dequeue();
    System.out.println("Front element after dequeue: " + obj.peek());
    obj.display();
  }
}
