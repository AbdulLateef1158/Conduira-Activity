import java.util.*;
class CollectionDemo1{
	public static void main(String[] args) {
		Set<Integer> hs=new HashSet<Integer>();
		for(int i=10;i>0;i--)
		{
			hs.add(i);
		}
		System.out.println(hs);
	}
}