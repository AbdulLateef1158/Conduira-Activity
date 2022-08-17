// Executed on  https://www.programiz.com/java-programming/online-compiler/
import java.util.*;
class Task4{
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<Integer>();
		Stack<Integer> s=new Stack<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		int sum=0;
		for(int i=0;i<6;i++){
			int t=q.remove();
			sum+=t;
			q.add(t);
		}
		System.out.println("Sum of the elements of the Queue is "+sum);
		s.add(q.remove());
		s.add(q.remove());
		System.out.println("removed elements are: "+s);
		s.clear();
		while(!q.isEmpty())
		{
			s.add(q.remove());
		}
		System.out.println("existing elements are: "+s);
	}
}