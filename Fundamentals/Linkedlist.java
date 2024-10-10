package Fundamentals;

import java.util.LinkedList;

public class Linkedlist {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("List: " + list);

        list.remove(0);// O(1)
        list.remove(Integer.valueOf(3));

        System.out.println("List: " + list);

        list.clear();

        list.offer(1);
        list.offer(2);
        list.offer(3);

        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());

        System.out.println("List: " + list);

        list.push(1);
        list.push(2);
        list.push(3);

        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());

        System.out.println("List: " + list);


    }
}
