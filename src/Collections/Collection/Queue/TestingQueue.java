package Collections.Collection.Queue;

import Collections.Utility;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);//throws exception
        queue.offer(2);//returns false
        System.out.println(queue);
        Utility.print(queue);
        System.out.println(queue.peek());//returns null
        System.out.println(queue.element());//throws exception
        System.out.println(queue.remove());
        Utility.print(queue);
        System.out.println(queue.poll());
        Utility.print(queue);
        System.out.println(queue.poll());//returns null
        queue.add(3);
        System.out.println(queue.remove());//throws exception

    }
}
