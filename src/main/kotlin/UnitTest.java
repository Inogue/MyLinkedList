public class UnitTest {
    public void prueba(){

        for(int i= 0; i<=100;i++){
            MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

            myLinkedList.get(i);
            myLinkedList.set(i, i);
            myLinkedList.remove(i);
            myLinkedList.addFirst(i);
            myLinkedList.addLast(i);
            myLinkedList.popFirst();
            myLinkedList.popLast();}
    }

  

}
