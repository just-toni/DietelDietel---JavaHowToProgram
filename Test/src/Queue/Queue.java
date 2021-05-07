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
            if(element[i] == 0){
                return element[i - 1];
            }
        }
        return 0;
    }

    public int dequeue() throws QueueUnderflowException{
        if(isEmpty());// throw new QueueUnderflowException();
        int valueToReturn = element[0];
        for (int i = 1; i < element.length; i++) {
            element[i - 1] = element [i];
        }
        return valueToReturn;
    }

    public int getTotalNumberOfElements() {
        System.out.println(placeValueHere);
        return placeValueHere;
    }

    public boolean isEmpty() {
        if(getTotalNumberOfElements() == 0) return true;
        else return false;
    }
}
