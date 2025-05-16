package assignment;
import java.util.LinkedList;

public class program1C4 {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");

	        System.out.println("Elements and their positions:");
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println("Position " + i + ": " + list.get(i));
	        }
	    }

}
