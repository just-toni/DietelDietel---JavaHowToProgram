package Queue;

import com.QueueExceptions.QueueOverflowException;
import com.QueueExceptions.QueueUnderflowException;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Queue {
    private int[] element;
    private int placeValueHere;

    public Queue(int value) {
        element = new int[value];
    }

    public void enqueue(int value) throws QueueOverflowException {
        if (isFull()) throw new QueueOverflowException("Queue overflow");
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

    public int dequeue() throws QueueUnderflowException {
        if(isEmpty()) throw new QueueUnderflowException("Queue is empty");
        int valueToReturn = element[placeValueHere - 1];
        placeValueHere--;
        if(!isFull()){
            for (int i = 1; i < element.length - 1; i++) {
                element[i - 1] = element [i];
            }
        }
        return valueToReturn;
    }
//
    public int getTotalNumberOfElements() {
        return placeValueHere;
    }

    public boolean isEmpty() {
        if(getTotalNumberOfElements() == 0) return true;
        else return false;
    }

    public boolean isFull() {
        if(element.length == getTotalNumberOfElements()) return true;
        else return false;
    }

    public String toString(){
        return Arrays.toString(element);
    }
}
