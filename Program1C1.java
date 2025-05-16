package assignment;
import java.util.LinkedList;
import java.util.ListIterator;
public class Program1C1 {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");

	        System.out.println("Original list: " + list);

	        ListIterator<String> iterator = list.listIterator(1); // 2nd position (index 1)

	        System.out.print("Iterating from 2nd position: ");
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + " ");
	        }
	        System.out.println();
	    }
	}

