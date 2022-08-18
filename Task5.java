// Executed on https://www.programiz.com/java-programming/online-compiler/
import java.util.*;
class Task5{
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		Queue<Integer> q2=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		System.out.println("Integers present in Queue: "+q);
		q2.add(q.remove());
		q2.add(q.remove());
		System.out.println("Integers removed from Queue: "+q2);
		System.out.println("Existing Integers in the Queue: "+q);
	}
}
