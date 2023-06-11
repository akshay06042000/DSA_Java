package linkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.prepend(7);
        myLinkedList.set(2,9);
        myLinkedList.insert(2,10);
        myLinkedList.append(13);
//        myLinkedList.remove(4);
//        myLinkedList.reverse();
        myLinkedList.printList();
        System.out.println("***********************************************");
        myLinkedList.partitionList(6);
        myLinkedList.printList();


//        System.out.println(myLinkedList.findMiddleNode().value);
//        System.out.println(myLinkedList.findKthFromEnd(2).value);
//        myLinkedList.reverseBetween(1,4);
//        myLinkedList.printList();
//        System.out.println("Removed node is : " + myLinkedList.removeFirst().value);
//        System.out.println("Removed node is : " + myLinkedList.removeFirst().value);
//        myLinkedList.printList();

//        System.out.println(myLinkedList.get(2).value);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast());

    }
}