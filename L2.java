import java.util.*;

public class L2 {

	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");

		System.out.println(ll);

		ll.remove("B");
		

		System.out.println(ll);
	}
}
