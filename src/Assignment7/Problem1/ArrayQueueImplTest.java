package Assignment7.Problem1;

import java.util.Queue;

public class ArrayQueueImplTest
{
    static void main()
    {
        ArrayQueueImpl cirQueue = new ArrayQueueImpl();

        System.out.println("Size : "+cirQueue.size());
        System.out.println("Is Empty: "+cirQueue.isEmpty());
        System.out.println("First Element : "+ cirQueue.peek());
        System.out.println(cirQueue.toString());

        cirQueue.enqueue(1);
        System.out.println("Size : "+cirQueue.size());
        System.out.println("Is Empty: "+cirQueue.isEmpty());
        System.out.println("First Element : "+ cirQueue.peek());
        System.out.println(cirQueue.toString());

        cirQueue.enqueue(2);
        cirQueue.enqueue(3);
        cirQueue.enqueue(4);
        cirQueue.enqueue(5);
        cirQueue.enqueue(6);
        cirQueue.enqueue(7);
        cirQueue.enqueue(8);
        cirQueue.enqueue(9);
        cirQueue.enqueue(10);

        System.out.println("Size : "+cirQueue.size());
        System.out.println("Is Empty: "+cirQueue.isEmpty());
        System.out.println("First Element : "+ cirQueue.peek());
        System.out.println(cirQueue.toString());

        System.out.println(cirQueue.dequeue());
        System.out.println(cirQueue.dequeue());
        System.out.println(cirQueue.dequeue());
        System.out.println(cirQueue.dequeue());
        System.out.println(cirQueue.dequeue());
        System.out.println(cirQueue.dequeue());
        System.out.println(cirQueue.dequeue());
        System.out.println(cirQueue.dequeue());
        System.out.println(cirQueue.dequeue());
        System.out.println("Size : "+cirQueue.size());
        System.out.println("Is Empty: "+cirQueue.isEmpty());
        System.out.println("First Element : "+ cirQueue.peek());
        System.out.println(cirQueue.toString());

        cirQueue.enqueue(1);
        System.out.println("Size : "+cirQueue.size());
        System.out.println("Is Empty: "+cirQueue.isEmpty());
        System.out.println("First Element : "+ cirQueue.peek());
        System.out.println(cirQueue.toString());




        cirQueue.enqueue(2);
        cirQueue.enqueue(3);
        cirQueue.enqueue(4);
        cirQueue.enqueue(5);
        cirQueue.enqueue(6);
        cirQueue.enqueue(7);
        cirQueue.enqueue(8);
        cirQueue.enqueue(9);
        cirQueue.enqueue(10);
        cirQueue.enqueue(2);
        cirQueue.enqueue(3);
        cirQueue.enqueue(4);
        cirQueue.enqueue(5);
        cirQueue.enqueue(6);
        cirQueue.enqueue(7);
        cirQueue.enqueue(8);
        cirQueue.enqueue(8);
        cirQueue.enqueue(8);
        cirQueue.enqueue(8);
        cirQueue.enqueue(9);
        cirQueue.enqueue(10);

        System.out.println(cirQueue.toString());



    }
}
