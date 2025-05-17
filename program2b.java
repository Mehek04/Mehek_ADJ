/* 2b.Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/
package assignment;
public class program2b {
	    public static void main(String[] args) {
	        int iterations = 10000;
	        String textToAppend = "AIET";

	        // Test StringBuffer
	        long startTime1 = System.nanoTime();
	        StringBuffer stringBuffer = new StringBuffer();
	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append(textToAppend);
	        }
	        long endTime1 = System.nanoTime();
	        long durationBuffer = endTime1 - startTime1;
	        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");

	        // Test StringBuilder
	        long startTime2 = System.nanoTime();
	        StringBuilder stringBuilder = new StringBuilder();
	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append(textToAppend);
	        }
	        long endTime2 = System.nanoTime();
	        long durationBuilder = endTime2 - startTime2;
	        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

	        // Justification
	        if (durationBuffer > durationBuilder) {
	            System.out.println("StringBuilder is faster than StringBuffer.");
	        } else {
	            System.out.println("StringBuffer is faster than StringBuilder.");
	        }
	    }

}
