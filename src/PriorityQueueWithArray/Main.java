package PriorityQueueWithArray;

public class Main {
    public static void main(String[] args) {
        Element element1 = new Element(3, 5);
        Element element2 = new Element(2, 4);
        Element element3 = new Element(45, 3);
        Element element4 = new Element(25, 7);
        Element element5 = new Element(6, 1);
        QueueWithArray queueWithArray = new QueueWithArray(5);
        System.out.println("Let the size of queue be five.");
        queueWithArray.enQueue(element1);
        queueWithArray.enQueue(element2);
        queueWithArray.enQueue(element3);
        queueWithArray.enQueue(element4);
        queueWithArray.printQueue();
        System.out.println("======================================");
        System.out.println("Initialising new element 6 with priority 1...");
        queueWithArray.enQueue(element5);
        queueWithArray.printQueue();
        System.out.println("Peek in queue...");
        queueWithArray.peekInQueue();
        System.out.println("Now, what if we delete an element from queue...");
        queueWithArray.deQueue();
        queueWithArray.printQueue();
        System.out.println("Here it delete first element of queue.");
    }
}
