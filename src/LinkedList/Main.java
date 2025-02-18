package LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(24);
        list.insertFirst(23);
        list.insertFirst(22);
        list.insertFirst(21);
        list.insert(25, 4);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
    }
}
