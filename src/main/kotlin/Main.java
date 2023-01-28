public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.size();
        myLinkedList.get(2);
        myLinkedList.set(1, 2);
        myLinkedList.remove(3);
        myLinkedList.addFirst(1);
        myLinkedList.addLast(1);
        myLinkedList.popFirst();
        myLinkedList.popLast();


        Node<Integer> nodo = new Node<>(4, null, null);
        Node<Integer> nodo1 = new Node<>(2, nodo, null);
        nodo.next = nodo1;
        Node<Integer> nodo2 = new Node<>(3, nodo1, null);
        nodo1.next = nodo2;

    }
}
