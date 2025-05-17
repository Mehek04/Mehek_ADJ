package assignment;
public class program3a {
	    public static void main(String[] args) {
	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        System.out.println("str1 equals str2: " + str1.equals(str2));
	        System.out.println("str1 equals 'Hello': " + str1.equals("Hello"));
	        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

	        // 4. String Searching
	        String str3 = "Welcome to Java Programming";
	        System.out.println("Index of 'Java': " + str3.indexOf("Java"));
	        System.out.println("Last index of 'a': " + str3.lastIndexOf("a"));

	        // 5. Substring Operations
	        System.out.println("Substring from index 11: " + str3.substring(11));
	        System.out.println("Substring from 11 to 15: " + str3.substring(11, 15));

	        // 6. String Modification
	        System.out.println("Replace 'Java' with 'Python': " + str3.replace("Java", "Python"));
	        System.out.println("Uppercase: " + str3.toUpperCase());
	        System.out.println("Lowercase: " + str3.toLowerCase());

	        // 7. Whitespace Handling
	        String str4 = "   AIET College   ";
	        System.out.println("Before trim: '" + str4 + "'");
	        System.out.println("After trim: '" + str4.trim() + "'");

	        // 8. String Concatenation
	        String full = str1 + " " + str2;
	        System.out.println("Concatenated string: " + full);

	        // 9. String Splitting
	        String sentence = "Java is easy to learn";
	        String[] words = sentence.split(" ");
	        System.out.println("Splitting sentence:");
	        for (String word : words) {
	            System.out.println(word);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        sb.insert(5, ",");
	        sb.replace(6, 11, " Java");
	        System.out.println("StringBuilder result: " + sb.toString());

	        // 11. String Formatting
	        String name = "Alice";
	        int age = 22;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted string: " + formatted);

	        // 12. Validate Email
	        String email = "student@aiet.edu";
	        if (email.contains("@") && email.startsWith("student") && email.endsWith(".edu")) {
	            System.out.println("Valid email format.");
	        } else {
	            System.out.println("Invalid email format.");
	        }
	    }
}
