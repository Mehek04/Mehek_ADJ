package assignment;
import java.util.LinkedList;
import java.util.Collections;
public class program1C5 {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");

	        System.out.println("Before swapping: " + list);

	        // Swap first (index 0) and third (index 2)
	        Collections.swap(list, 0, 2);

	        System.out.println("After swapping first and third: " + list);
	    }
	

}
