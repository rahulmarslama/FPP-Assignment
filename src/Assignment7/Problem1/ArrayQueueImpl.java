package Assignment7.Problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayQueueImpl
{
    private final int DEFAULT_CAPACITY = 10;
    private int size;
    public int capacity;
    private Integer[] arr;
    public int front;
    public int rear;

    public ArrayQueueImpl()
    {
        arr= new Integer[DEFAULT_CAPACITY];
        front=-1;
        rear=-1;
        size=0;
        capacity = DEFAULT_CAPACITY;
    }
    // Add Constructors, Default and Parameterized to initialize instance fields

    public Integer peek()
    {
        if(isEmpty()) return null;
        return arr[front];
    }
    public void enqueue(int obj)
    {
        if((front-rear-1)% capacity == 0)
        {
            resize();
        }
        if(isEmpty())
        {
            front = (front+1) % capacity;
            arr[front]=obj;
            rear= (rear+1)%capacity;
        }
        else
        {
            rear = (rear+1)%capacity;
            arr[rear] = obj;
        }
        ++size;
        /*if((front+rear+1)%size == 0)
        {
            resize();
            //to be implemented
        }*/
    }
    public Integer dequeue()
    {
        if(isEmpty()) return -1;
        int deletedValue = arr[front];
        /*if(front == rear)
        {
            rear = -1;
            front =-1;
        }*/
        front = (front+1)%capacity;
        --size;
        return deletedValue;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public void resize()
    {
        if(isEmpty()) return;
        /*if((front-rear-1)% capacity == 0)
        {
            return;
        }*/
        Integer[] temp = new Integer[arr.length*2];

        int index =front;
        int runningIndex = (index+1)%capacity;

        temp[0] = arr[front];
        int i=1;
        while(runningIndex!=rear)
        {
            temp[i] = arr[runningIndex];
            i++;
            runningIndex = (runningIndex+1)%capacity;
        }
        temp[i] = arr[rear];

        arr = temp;
        front = 0;
        rear = size-1;
        capacity = temp.length;
    }
    public String toString()
    {
        StringBuilder str = new StringBuilder("[");
        int index = front;
        for(int i=0;i<size;i++)
        {
            str.append(arr[index]);
            str.append(" ");
            index = (index+1) % capacity;
        }
        str.append("]");
    /* Return data in this format, each element separated by comma with in [ ] eg:
    [10, 20, 30, 40, 50, 60 ]*/
        return str.toString();
    }
}