package LinkedList;

public class LinkedList {

        private Node head;
        private Node tail;
        private int size;

        public LinkedList(){
            this.size = 0;
        }

        //function for adding head elements
        public void insertFirst(int value){
            Node node = new Node(value);
            node.next = head;
            head = node;
            if(tail == null){
                tail = head;
            }
            size +=1;
        }

        //function for adding tail elements
        public void insertLast(int value){
            if(tail == null){
                insertFirst(value);
                return;
            }
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            size++;
        }

        //function for inserting node @ particular index
    public void insert(int value, int index){
            if(index == 0){
                insertFirst(value);
                return;
            }
            if(index == size){
                insertLast(value);
                return;
            }
            Node temp = head;

            for (int i = 0; i < index-1; i++) {
            temp = temp.next;
            }

            Node node = new Node(value, temp.next);
            temp.next = node;

            size++;

    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //function for deleting tail O(n) = as it needs to traverse through the array
    public int deleteLast(){
            if(size <= 1){
                return deleteFirst();
            }
            Node secondLast = get(size - 2);
            int val = tail.value;

            tail = secondLast;
            tail.next = null;

            return val;
    }

    //function for deleting head
    public int deleteFirst(){
            int val = head.value;
            head = head.next;
            if(head == null){
                tail = null;
            }
            size--;
            return val;
    }


       //function for displaying elements
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value+ " -> ");
                temp = temp.next;
            }
            System.out.println("END");
        }

        private class Node {
            private int value;
            private Node next;


            public Node(int value) {
                this.value = value;
            }

            public Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }

        }

}
