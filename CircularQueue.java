import java.util.*;

public class CircularQueue {
  int front;
  int rear;
  int size;
  int count;
  int[] queue;

  CircularQueue(int size) {
    front = 0;
    rear = -1;
    count = 0;
    this.size = size;
    queue = new int[size];
  }

  void enqueue(int value) {
    if (count == size) {
      System.out.print("Queue is full");
    }
    rear = (rear + 1) % size;
    queue[rear] = value;
    count++;
  }

  void dequeue() {
    if (count == 0) {
      System.out.println("Queue is empty");
    } else {
      System.out.println("After dequeue " + queue[front] + " is removed");
      front = (front + 1) % size;
      count--;
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
    if (count == 0) {
      System.out.println("Queue is empty.");
      return;
    } else {
      int index = front;
      for (int i = 0; i < count; i++) {
        System.out.println(queue[index]);
        index = (index + 1) % size;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    CircularQueue obj = new CircularQueue(5);
    obj.enqueue(10);
    obj.enqueue(20);
    obj.enqueue(30);
    obj.enqueue(40);
    obj.enqueue(50);
    obj.display();
    System.out.println("Front element: " + obj.peek());
    obj.dequeue();
    System.out.println("Front element after dequeue: " + obj.peek());
    System.out.println();
    obj.display();
  }
}
