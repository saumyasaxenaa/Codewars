package Fundamentals;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priorityqueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(4);
        pq.offer(5);
        pq.offer(1);

        System.out.println(pq.poll());
        System.out.println(pq.poll());

        PriorityQueue<UserProfile> UserProfile = new PriorityQueue<>(Comparator.comparing((UserProfile u) -> u.age));

        UserProfile.offer(new UserProfile(20));
        UserProfile.offer(new UserProfile(25));
        UserProfile.offer(new UserProfile(18));

        System.out.println(UserProfile.poll().age);
    }

    static class UserProfile {
        private final Integer age;

        public UserProfile(Integer age) {
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }

    }
}
