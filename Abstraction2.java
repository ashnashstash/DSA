public class Abstraction2 extends Abstraction {
  void start() {
    System.out.println("the car started");
  }

  void display() {
    System.out.println("abstraction implemented");
  }

  public static void main(String[] args) {
    Abstraction2 obj = new Abstraction2();
    obj.start();
    obj.disp();
    obj.display();
  }
}
