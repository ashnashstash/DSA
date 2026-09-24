import java.util.*;

public class ArrayQueue {
  int front;
  int rear;
  int size;
  int[] queue;

  ArrayQueue(int size) {
    front = 0;
    rear = -1;
    this.size = size;
    queue = new int[size];
  }

  void enqueue(int value) {
    if (rear == size - 1) {
      System.out.print("Queue is full");
    } else {
      queue[++rear] = value;
    }
  }

  void dequeue() {
    int temp = 0;
    if (rear == -1 || front > rear || front > size - 1) {
      System.out.print("Queue is empty");
    } else {
      temp = queue[front++];
      System.out.print(temp);
    }
  }

  int peek() {
    if (rear == -1) {
      System.out.println("Queue is empty.");
      return -1;
    }
    return queue[front];
  }

  void display() {
    if (rear == -1 || front > rear || front > size - 1) {
      System.out.println("Queue is empty.");
      return;
    } else {
      for (int i = front; i <= rear; i++) {
        System.out.println(queue[i]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of queue: ");
    int len = sc.nextInt();
    ArrayQueue obj = new ArrayQueue(len);
    obj.enqueue(10);
    obj.enqueue(20);
    obj.enqueue(30);
    obj.enqueue(40);
    obj.display();
    System.out.println("Front element: " + obj.peek());
    System.out.print("Dequeued element: ");
    obj.dequeue();
    System.out.println();
    System.out.println("Front element after dequeue: " + obj.peek());
    obj.display();
  }
}
