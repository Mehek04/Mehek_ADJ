package assignment;
import java.util.ArrayList;
import java.util.Collections;
public class program1b3 {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("Before sorting: " + colors);

	        Collections.sort(colors);

	        System.out.println("After sorting: " + colors);
	    }
	}

