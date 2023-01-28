import java.util.ArrayList;

public class MyLinkedList<T> {
    private final ArrayList<Node<T>> ramMemory = new ArrayList<>();
    Node<T> firstNode = null;

    // FUNCIONS COMUNES

    /**
     * Returns the of this collection
     */
    public int size() {
        return ramMemory.size();
    }

    /**
     * Get the value at given index
     */

    public T get(Integer index) {
        Node<T> nodo0 = firstNode;
        for (int i = 0; i < index; i++) {
            nodo0 = nodo0.next;
        }
        return nodo0.content;
    }

    /**
     * Adds the element at index
     */
    public void set(Integer index, T element) {
        Node<T> nodo0 = firstNode;
        for (int i = 0; i < index; i++) {
            nodo0 = nodo0.next;
        }
        nodo0.content = element;

    }

    /**
     * Removes the element at index
     */
    public void remove(Integer index) {
        Node<T> nodo0 = firstNode;
        for (int i = 0; i < index; i++) {
            nodo0 = nodo0.next;
        }
        if (index == 0) {
            Node<T> nodo1 = nodo0.next;
            if (nodo1 != null) {
                nodo1.previous = null;
                firstNode = nodo1;

            } else {
                firstNode = null;
            }
        } else if (ramMemory.size() - 1 == index) {
            Node<T> nodo1 = nodo0.previous;
            nodo1.next = null;

        } else {
            Node<T> nodo1 = nodo0.previous;
            Node<T> nodo2 = nodo0.next;

            nodo1.next = nodo2;
            nodo2.previous = nodo1;

        }
        ramMemory.remove(nodo0);
    }
    // PILES I CUES

    /**
     * Adds the element at the fist position
     */
    public void addFirst(T element) {
        Node<T> nodo0 = firstNode;
        Node<T> nodo1 = nodo0.next;

        if (nodo1 != null) {
            Node<T> newnodo = new Node<>(element, null, nodo0);
        } else {
            Node<T> newnodo = new Node<>(element, null, null);
        }

    }

    /**
     * Adds the element at the last position
     */
    public void addLast(T element) {
        Node<T> nodo0 = firstNode;

        for (int i = 0; i < ramMemory.size() - 1; i++) {
            nodo0 = nodo0.next;
        }
        if (nodo0 != null) {
            Node<T> newnodo = new Node<>(element, nodo0, null);
        } else {
            Node<T> newnodo = new Node<>(element, null, null);
        }
    }

    /**
     * Get and remove the element at the first position
     */
    public T popFirst() {
        T nodo = get(0);
        remove(0);
        return nodo;
    }

    /**
     * Get and remove the element at the last position
     */
    public T popLast() {
int contador=0;
        for (int i = 0; i < ramMemory.size() - 1; i++) {
            if (i == ramMemory.size() - 1) {
                contador=i;
            }
        }
        T nodo = get(contador);
        remove(contador);
        return nodo;
    }
}