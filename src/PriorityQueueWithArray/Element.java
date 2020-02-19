package PriorityQueueWithArray;

public class Element {
    private int data;
    private int priority;

    public Element(int data, int priority) {
        this.data = data;
        this.priority = priority;
    }

    public int getData() {
        return data;
    }

    public int getPriority() {
        return priority;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}