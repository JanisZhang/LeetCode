package interview;

public class PriorityQueue {
        public static void main(String[] args) {
            java.util.PriorityQueue to = new java.util.PriorityQueue();
            to.add("dishes");
            to.add("laundry");
            to.add("bills");
            to.offer("bills");

            System.out.println(to.size() + " "+ to.poll());
            System.out.println(to.peek() + " "+ to.poll());
            System.out.println(to.poll() + " "+ to.poll());

        }
}
