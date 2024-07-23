package Collections.Collection.Queue;

import Collections.Utility;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Student> queue=new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.grade().compareTo(o2.grade());
            }
        });
        queue.offer(new Student("prashant",Grade.A));
        queue.offer(new Student("rahul",Grade.D));
        queue.offer(new Student("vinod",Grade.C));
        queue.offer(new Student("ayush",Grade.E));
        queue.offer(new Student("shivam",Grade.F));
        Utility.print(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }


    public record Student(String name, Grade grade) {

        @Override
            public String toString() {
                return name + ": " + grade;
            }
        }
}
