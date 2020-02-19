package PriorityQueueWithArray;

public class QueueWithArray {
    int front;
    int rear;
    Element[] arr;

    public QueueWithArray(int size) {
        front = rear = -1;
        arr = new Element[size];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == arr.length - 1;
    }

    public void enQueue(Element newElement) {
        int i;
        if (arr == null) {
            System.out.println("Queue is not created...");
        }
        if (isFull()) {
            System.out.println("Overflow...");
        } else if (isEmpty()) {
            front++;
            rear++;
            arr[rear] = newElement;
        } else {
            for (i = rear; i >= front; i--) {
                if (newElement.getPriority() < arr[i].getPriority()) {
                    arr[i + 1] = arr[i];
                } else break;
            }
            arr[i + 1] = newElement;
            rear++;
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Underflow...");
        } else {
            System.out.println(arr[front]);
            front++;
            if (front > rear) {
                front = rear = -1;
            }
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Underflow...");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(arr[i].getData());
            }
        }
    }

    public void peekInQueue() {
        if (isEmpty()) {
            System.out.println("Underflow...");
        } else {
            System.out.println(arr[front]);
        }
    }
}