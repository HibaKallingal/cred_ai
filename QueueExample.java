import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> myNum = new LinkedList<Integer>();
        myNum.add(23);
        myNum.add(12);
        myNum.add(35);
        myNum.add(46);
        System.out.println(myNum.peek());
        myNum.poll();
        System.out.println(myNum);
    }
    
}
