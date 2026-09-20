public class StringLinkedList {

  Node head;

  void insert(String data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      return;
    }

    Node temp = head;

    while (temp.next != null) {
      temp = temp.next;
    }

    temp.next = newNode;
  }

  void upperCaseString() {
    Node temp = head;

    while (temp != null) {

      if (Character.isUpperCase(temp.data.charAt(0))) {
        System.out.println(temp.data);
      }

      temp = temp.next;
    }
  }

  public static void main(String[] args) {

    StringLinkedList obj = new StringLinkedList();

    obj.insert("Stacy");
    obj.insert("jeremy");
    obj.insert("Crystal");
    obj.insert("andrew");
    obj.insert("Penelopy");

    obj.upperCaseString();
  }
}

class Node {

  String data;
  Node next;

  Node(String data) {
    this.data = data;
    this.next = null;
  }
}
