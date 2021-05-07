package Queue;

public class Queue {
    private int[] element;
    private int placeValueHere;

    public Queue(int value) {
        element = new int[value];
    }

    public void enqueue(int value) {
        element[placeValueHere] = value;
        placeValueHere++;
    }


    public int peekFirst() {
        return element[0];
    }

    public int peekLast() {
        for (int i = 0; i < element.length; i++) {

        }
        return 0;
    }

    public int dequeue() {
        return element[0];
    }
}
